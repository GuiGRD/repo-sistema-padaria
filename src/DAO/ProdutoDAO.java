package DAO;

import CONEXAO.Conexao;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();

    public ProdutoDAO() {
        conn = new Conexao().conectaBD();
    }

    public void cadastrarProduto(ProdutoDTO obj) {
        String sql = ""
                + "INSERT INTO tbl_produto "
                + "(pro_cod_barra, "
                + "pro_nome) "
                + "VALUES(?,?)";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getCodbarraProduto());
            pst.setString(2, obj.getNomeProduto());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso ");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto, verifique se todos os campos foram preenchidos\n  " + erro);
        }
    }

    public void editarProduto(ProdutoDTO obj) {
        String sql = "UPDATE tbl_produto SET "
                + "pro_cod_barra=?, "
                + "pro_nome=?"
                + "WHERE id_produto=?";

        try {

            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getCodbarraProduto());
            pst.setString(2, obj.getNomeProduto());
            pst.setInt(3, obj.getIdProduto());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o produto " + erro);
        }
    }

    public void excluirProduto(ProdutoDTO obj) {
        String sql = ""
                + "DELETE FROM tbl_produto "
                + "WHERE id_produto = ?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, obj.getIdProduto());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto " + erro);
        }

    }

    public ArrayList<ProdutoDTO> listarProduto() {
        String sql = "SELECT "
                + "p.id_produto, "
                + "p.pro_cod_barra, "
                + "p.pro_nome, "
                + "p.pro_estoque "
                + "FROM tbl_produto AS p ";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                ProdutoDTO objdto = new ProdutoDTO();


                objdto.setIdProduto(rs.getInt("p.id_produto"));
                objdto.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));
                objdto.setNomeProduto(rs.getString("p.pro_nome"));
                objdto.setEstoqueProduto(rs.getInt("p.pro_estoque"));

                lista.add(objdto);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o ProdutoDAO" + erro);
            return null;
        }
        // Esse metodo retorna toda a lista dos usuarios cadastrado

    }

    public ArrayList<ProdutoDTO> buscarNomeProduto(String nome) {

        String sql = "SELECT "
                + " p.id_produto,"
                + " p.pro_cod_barra,"
                + " p.pro_nome,"
                + " p.pro_estoque"
                + " FROM tbl_produto AS p"
                + " WHERE pro_nome LIKE ?";

        try {

            pst = conn.prepareStatement(sql);

            pst.setString(1, nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                ProdutoDTO obj = new ProdutoDTO();
                FornecedorDTO f = new FornecedorDTO();

                obj.setIdProduto(rs.getInt("id_produto "));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra "));
                obj.setNomeProduto(rs.getString("pro_nome "));


                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PRODUTODAO - Produto não selecionado para busca " + erro);
            return null;
        }

        // Esse metodo retorna o produto cadastrados
    }

    public ArrayList<ProdutoDTO> buscarCodigoProduto(int pro_cod_barra) {

        String sql = "SELECT *"
                + " FROM tbl_produto "
                + " WHERE pro_cod_barra LIKE ? ";

        try {

            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_cod_barra);
            rs = pst.executeQuery();

            while (rs.next()) {
                ProdutoDTO obj = new ProdutoDTO();

                obj.setIdProduto(rs.getInt("id_produto "));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra "));
                obj.setNomeProduto(rs.getString("pro_nome "));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Produto não selecionado para busca " + erro);
            return null;

        }

    }

    /**
     * Método baixa de estoque Realiza a baixa de estoque no momento da venda
     */
    public void atualizarEstoque(int id_produto, int pro_estoque) {

        String sql = "UPDATE tbl_produto "
                + "SET pro_estoque = ? "
                + "WHERE id_produto = ?";

        try {

            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_estoque);
            pst.setInt(2, id_produto);
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }

    }

    /**
     * Metodo que retorna o estoque atual de um produto
     */
    public int retornaEstoqueAtual(int id_produto) {

        int estoque = 0;
        String sql = "SELECT pro_estoque "
                + "FROM tbl_produto"
                + "wHERE id_produto=?";
        try {

            pst = conn.prepareStatement(sql);
            pst.setInt(1, id_produto);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                estoque = (rs.getInt("pro_estoque"));
            }

            return estoque;

        } catch (SQLException e) {

        }
        return 0;
    }

    public ProdutoDTO pesquisarNomeProduto(String pro_nome) {

        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "WHERE pro_nome = ? ";

        try {

            pst = conn.prepareStatement(sql);
            pst.setString(1, pro_nome);
            rs = pst.executeQuery();
            ProdutoDTO obj = new ProdutoDTO();

            if (rs.next()) {

                obj.setIdProduto(rs.getInt("id_produto"));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra"));
                obj.setNomeProduto(rs.getString("pro_nome"));

            }
            return obj;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Produto não selecionado para busca " + erro);
            return null;
        }

        // Esse metodo retorna o produto cadastrados
    }

    public ProdutoDTO pesquisarCodigoProduto(int pro_cod_barra) {

        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "WHERE pro_cod_barra = ? ";

        try {

            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_cod_barra);
            rs = pst.executeQuery();
            ProdutoDTO obj = new ProdutoDTO();

            if (rs.next()) {

                obj.setIdProduto(rs.getInt("id_produto"));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra"));
                obj.setNomeProduto(rs.getString("pro_nome"));

            }
            return obj;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Produto não selecionado para busca " + erro);
            return null;

        }

    }

    public ResultSet CBXlistarNomeProduto() // lista o nome  para jogar na combobox
    {
        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "ORDER BY pro_nome ";
        try {
            pst = conn.prepareStatement(sql);

            return pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " ListarNomeProdutoDAO" + erro);
            return null;
        }

    }

    public ResultSet CBXlistarCodigoProduto() // lista o nome  para jogar na combobox
    {
        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "ORDER BY pro_cod_barra ";
        try {
            pst = conn.prepareStatement(sql);

            return pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " ListarCod.BarraProdutoDAO" + erro);
            return null;
        }

    }

}
