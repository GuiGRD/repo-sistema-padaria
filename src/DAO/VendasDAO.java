
package DAO;

import DTO.ClienteDTO;
import DTO.CompraDTO;
import DTO.ProdutoDTO;
import DTO.VendasDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

 	/**
 	 * Método Venda:
 	 * Salva as infromações no BD_TV(Banco de Dados na Tabela Vendas)
 	 */
public class VendasDAO 
{
    Connection conn; //Cria a Conexão
    PreparedStatement pst; // Prepara a Conexão
    ResultSet rs; //Retorna todo o resultado encontrado percorrendo cada linha do BD_TV
    ArrayList<VendasDTO> lista = new ArrayList<>(); //Cria uma Lista das informações do BD_TV
    

 	/**
	 * Método Cadastrar Venda:
	 * Salva as infromações dos Produtos vendidos no BD na Tabela Venda
	 * @param obj Venda cadastrar a venda realizada
	 */	
    public void cadastrarVenda(VendasDTO obj){
         try {
            
            String sql = "INSERT INTO tbl_vendas ("
                    + "venda_data, "
                    + "fk_cliente, "
                    + "fk_produto, "
                    + "fk_compra, "
                    + "venda_qnt, "   
                    + "venda_valor"
                    + "venda_desconto, "
                    + "venda_total)"
                    + "VALUES(?,?,?,?,?,?,?,?)";

            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);
            pst.setDate(1, (Date) obj.getDataVenda());
            pst.setInt(2, obj.getCliente().getIdCliente());
            pst.setInt(3, obj.getProduto().getIdProduto());
            pst.setInt(4, obj.getCompra().getIdCompra());
            pst.setInt(5, obj.getQntVenda());
            pst.setDouble(6, obj.getTotalVenda());
            pst.setDouble(7, obj.getDescontoVenda());
            pst.setDouble(8, obj.getTotalVenda());
            
            
            //Executar o comando SQL
            pst.execute();
            pst.close();
            
           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    
   	/**
	 * Método lista as vendas entre datas
	 * Pega as informações do BD da Tabela Venda e mostra em uma lista com todas as vendas no período solicitado
	 * @return Retorna a lista com todos os Produtos vendidos da tabela de vendas
	 */

    public ArrayList<VendasDTO> listarVendasPeriodo(LocalDate data_inicial, LocalDate data_final) {

        try {


            String sql = "SELECT venda_data , "
                    + "FROM tbl_vendas as v,  "
                    + "venda_data(v.venda_data,'%d/%m/%Y/ H%/%i/%S') , "
                    + " INNER JOIN tbl_cliente AS c ON(v.fk_cliente = c.id_cliente), "
                    + " INNER JOIN tbl_produto AS p ON(v.fk_produto = p.id_produto), "
                    + " INNER JOIN tbl_compra AS cp ON(v.fk_compra = cp.id_compra), "
                    + "c.cli_nome, "
                    + "c.cli_cpf,  "
                    + "p.pro_cod_barra, "
                    + "p.pro_nome, "
                    + "cp.compra_pro_qnt, "
                    + "cp.compra_preco_venda, "
                    + "v.total_venda, "
                     
                    + " WHERE v.data_venda BETWEEN ? AND ?";
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, data_inicial.toString());
            pst.setString(2, data_final.toString());
            
           rs = pst.executeQuery();

            while (rs.next()) 
            {
                VendasDTO obj = new VendasDTO();
                ClienteDTO c = new ClienteDTO();
                ProdutoDTO p = new ProdutoDTO();
                CompraDTO cp = new CompraDTO();
                
                obj.setIdVenda(rs.getInt("v.id_venda"));
                obj.setDataVenda(rs.getDate("v.venda_data"));  
                obj.setQntVenda(rs.getInt("v.venda_qnt"));
                obj.setValorProd(rs.getDouble("venda_valor"));
                obj.setDescontoVenda(rs.getDouble("v.venda_desconto"));
                obj.setTotalVenda(rs.getDouble("v.venda_total"));
                
                
                c.setNomeCliente(rs.getString("c.cli_nome"));
                c.setCpfCliente(rs.getString("c.cli_cpf"));
                
                cp.setCompraPrecoVenda(rs.getDouble("cp.compra_preco_venda"));
                
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));
                p.setNomeProduto(rs.getString("p.pro_nome"));

                obj.setCliente(c);
                obj.setProduto(p);
                obj.setCompra(cp);

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }

    
    
    

        //retornar ultima venda
  
    public int retornarVenda(){
        try {
            int venda = 0;
            
            String sql = "SELECT MAX(id_vendas) id_vendas FROM tbl_vendas;";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                VendasDTO obj = new VendasDTO();
                obj.setIdVenda(rs.getInt("id_vendas"));
                
                venda = obj.getIdVenda();
                
            }
            
            return venda;
            
            
        } catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
         
    }
  

    
    //Método para calcular o total das vendas no dia 
    public double totalVendasNoDia(LocalDate venda_data){
        try {
            double totalvendas = 0;
            
            String sql = "SELECT SUM(venda_total) AS total"                  
                    + "FROM tbl_vendas "
                    + "WHERE venda_data = ?";
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, venda_data.toString());
            
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                totalvendas = rs.getDouble("total");
            }
            return totalvendas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    //Método para calcular o produto mais vendido no dia 
    public int produtosVendasNoDia(int pro_cod_barra){
        try {
            int produtovendas = 0;
            
            String sql = "SELECT SUM(p.prod_cod_barra) AS cod"                  
                    + "FROM tbl_vendas as v  "

                    + " INNER JOIN tbl_produto AS p ON(v.fk_produto = p.id_produto) "

                    + "p.pro_cod_barra, "
                    + "WHERE p.pro_cod_barra = ?";

            
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, pro_cod_barra);
            
            rs = pst.executeQuery();
            
            if(rs.next())
            {
                produtovendas = rs.getInt("cod");
            }
            return produtovendas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
    
    
}
