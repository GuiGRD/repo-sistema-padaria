package DAO;

import CONEXAO.Conexao;
import DTO.CompraDTO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import VIEW.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pri Bucholz
 */
public class CompraDAO {

    //Cria a Conexão
    Connection conn = new Conexao().conectaBD();
    // Prepara a Conexão
    PreparedStatement pst;
     //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<CompraDTO> lista = new ArrayList<>();

    
    
     /**
     * Método Compra serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar, Editar, Excluir e Consultar as
     * informações no banco de dados na tabela compra.
     */
    public void cadastrarCompra(CompraDTO obj)
    
    {
        //Através dos comandos SQL salva as informações nas colunas da tabela compra no banco de dados.
        String sql = ""
                + "INSERT INTO tbl_compra( "
                + " date_format(compra_data,'%d/%m/%Y') as data_format ,"
                + " fk_fornecedor, "
                + " compra_total) "
                + " VALUES (?,?,?)";

        try {
            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);


            pst.setString(1, obj.getDataCompra());
            pst.setInt(2, obj.getFornecedor().getIdFornecedor());
            pst.setInt(3, obj.getCompraValorTotal());

            
            //Executar o comando SQL
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a compra " + erro);
        }
    }
    /**
     * Método Editar: Altera as informações no banco de dados na tabela compra
     * de acordo com os atributos informados pelo usuário.
     *
     * @param obj CompraDTO conecta com banco para fazer as alterações das
     * informações.
     */
    public void editarCompra(CompraDTO obj) {
        //Através dos comandos SQL edita as informações nas colunas da tabela compra no banco de dados.
        String sql = ""
                + "UPDATE tbl_compra "
                + "SET "
                + " date_format(compra_data,'%d/%m/%Y') "
                + " AS data_format=?, "
                + " fk_fornecedor=?, "
                + " compra_total=? "
                + "WHERE id_compra=?";

        try {
            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);

            pst.setString(1, obj.getDataCompra());
            pst.setInt(2, obj.getFornecedor().getIdFornecedor());
            pst.setInt(3, obj.getCompraValorTotal());

            pst.setInt(4, obj.getIdCompra());
            //Executar o comando SQL
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra alterada com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a compra " + erro);
        }

    }
    /**
     * Método Excluir: Exclui as informações no banco de dados nas colunas da
     * tabela compra informado pelo usuário.
     *
     * @param obj CompraDTO conecta com banco para excluir as informações.
     */
    public void excluirCompra(CompraDTO obj) {
         //Através dos comandos SQL exclui as informações nas colunas da tabela compra no banco de dados.
        
        String sql = ""
                + "DELETE FROM tbl_compra "
                + "WHERE id_compra = ?";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com o  nome da coluna informada na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getIdCompra());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra excluida com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a compra " + erro);
        }

    }
    /**
     * Método Listar: Pega todas as informações do banco de dados das colunas da
     * tabela compra e retorna listando em uma tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<CompraDTO> listarCompra() {
        //Através dos comandos SQL lista todas informações nas colunas da tabela compra no banco de dados.
        String sql = " SELECT * "
                + " FROM tbl_compra as c "
                + " INNER JOIN tbl_fornecedor AS f "
                + "ON(c.fk_fornecedor = f.id_fornecedor) ";
                
        try {
        //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();


                
                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));

                obj.setCompraValorTotal(rs.getInt("c.compra_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));


                obj.setFornecedor(f);


                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CompraDAO LISTAR " + erro);
            return null;
        }
         
    }
    /**
     * Método Buscar: Pega as informações do nome do fornecedor escolhido no
     * banco de dados das colunas da tabela fornecedor e retorna listando em uma
     * tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    
    public ArrayList<CompraDTO> buscarCompraFornecedor(String forn_nome) {
       //Através dos comandos SQL lista específicando o nome, e todas as informacoes nas colunas da tabela compra no banco de dados.
        String sql = "SELECT *"
                + " FROM tbl_compra as c "
                + "INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor) "
                + "INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto) "
                + "WHERE f.forn_nome=?";
              

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, forn_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();


                
                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));

                obj.setCompraValorTotal(rs.getInt("c.compra_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));


                obj.setFornecedor(f);

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO em CompraDAO " + erro);
        }
        return null;

    }
    
      
    
}
