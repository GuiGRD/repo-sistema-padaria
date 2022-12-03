
package DAO;


import CONEXAO.Conexao;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author Pri
 */
public class ProdutoDAOTest 
{
    
    Connection conn;
    // Prepara a Conexão, cria um obj para representar as instrucoes do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
    
    public ProdutoDAOTest() {
        conn = new Conexao().conectaBD();
        
    }
   
public  boolean cadastrarProduto(ProdutoDTO obj) {
        //Através dos comandos SQL salva as informações nas colunas da tabela produto no banco de dados.
        String sql = ""
                + "INSERT INTO tbl_produto "
                + "(pro_cod_barra, "
                + "pro_nome) "
                + "VALUES(?,?)";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com a ordem dos nome das colunas informadas na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getCodbarraProduto());
            pst.setString(2, obj.getNomeProduto());

            pst.execute();
            pst.close();

            
        } catch (SQLException erro) {
            return false;
        }
        return true;
    }


    public boolean editarProduto(ProdutoDTO obj) {
        //Através dos comandos SQL edita as informações nas colunas da tabela produto no banco de dados.
        String sql = ""
                + "UPDATE tbl_produto "
                + "SET "
                + "pro_cod_barra=?, "
                + "pro_nome=? "
                + "WHERE id_produto=?";

        try {
//Conecta no banco e prepara organizando o comando SQL de acordo e na ordem dos nome das colunas informadas na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getCodbarraProduto());
            pst.setString(2, obj.getNomeProduto());
            pst.setInt(3, obj.getIdProduto());

            pst.execute();
            pst.close();

           

        } catch (SQLException erro) {
            return false;
        }
        return true;
    }


    public boolean excluirProduto(ProdutoDTO obj) {
        //Através dos comandos SQL exclui as informações nas colunas da tabela produto no banco de dados.
        String sql = ""
                + "DELETE FROM tbl_produto "
                + "WHERE id_produto = ?";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com o  nome da coluna informada na String SQL.
            pst = conn.prepareStatement(sql);
            pst.setInt(1, obj.getIdProduto());

            pst.execute();
            pst.close();

            

        } catch (SQLException erro) {
            return false;
        }
        return true;

    }


    public ArrayList<ProdutoDTO> listarProduto() {
        //Através dos comandos SQL lista todas informações nas colunas da tabela produto no banco de dados.
        String sql = ""
                + "SELECT * "
                + "FROM tbl_produto";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                ProdutoDTO obj = new ProdutoDTO();

                obj.setIdProduto(rs.getInt("id_produto"));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra"));
                obj.setNomeProduto(rs.getString("pro_nome"));
                obj.setEstoqueProduto(rs.getInt("pro_estoque"));
                obj.setPrecoVendaProduto(rs.getInt("pro_preco_venda"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            
            return null;
        }

    }


    public ArrayList<ProdutoDTO> buscarNomeProduto(String nome) {
//Através dos comandos SQL lista específicando o nome, e todas as informações nas colunas da tabela produto no banco de dados.
        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "WHERE pro_nome LIKE ?";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                ProdutoDTO obj = new ProdutoDTO();

                obj.setIdProduto(rs.getInt("id_produto "));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra "));
                obj.setNomeProduto(rs.getString("pro_nome "));
                obj.setPrecoVendaProduto(rs.getInt("pro_preco_venda"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            return null;
        }
    }


    public ProdutoDTO buscarCodigoProduto(int pro_cod_barra) {
    //Através dos comandos SQL lista específicando o nome, e todas as informacoes nas colunas da tabela produto no banco de dados.
        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "WHERE pro_cod_barra = ? ";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_cod_barra);
            rs = pst.executeQuery();
            ProdutoDTO obj = new ProdutoDTO();

            if (rs.next()) {

                obj.setIdProduto(rs.getInt("id_produto"));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra"));
                obj.setNomeProduto(rs.getString("pro_nome"));
                lista.add(obj);
                
            }
            return obj;

        } catch (SQLException erro) {
            return null;
        }

    }
 
}
