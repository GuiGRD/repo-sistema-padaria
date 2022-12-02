package DAO;

import CONEXAO.Conexao;
import DTO.CompraDTO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CompraDAO {

    Connection conn = new Conexao().conectaBD();
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<CompraDTO> lista = new ArrayList<>();

    public void cadastrarCompra(CompraDTO obj) {
        String sql = ""
                + "INSERT INTO tbl_compra"
                + "compra_data('%d/%m/%Y/), "
                + "fk_fornecedor, "
                + "fk_produto, "
                + "compra_pro_qnt, "
                + "compra_preco, "
                + "compra_preco_venda, "
                + "compra_valor_total,"
                + "compra_validade"
                + "VALUES (?,?,?,?,?,?,?,?)";

        

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, obj.getDataCompra());
            pst.setInt(2, obj.getFornecedor().getIdFornecedor());
            pst.setInt(3, obj.getProduto().getIdProduto());

            pst.setDouble(4, obj.getCompraPreco());
            pst.setDouble(5, obj.getCompraPrecoVenda());
            pst.setDouble(6, obj.getCompraValorTotal());
            pst.setString(7, obj.getCompraValidade());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a compra " + erro);
        }
    }

    public void editarCompra(CompraDTO obj) {
        String sql = ""
                + "UPDATE INTO tbl_compra "
                + "SET "
                + "compra_data = ?, "
                + "fk_fornecedor = ?, "
                + "fk_produto = ?,"
                + "compra_preco =?,"
                + "compra_preco_venda=?, "
                + "compra_valor_total=?, "
                + "compra_validade = ?)"
                + "WHERE id_compra=?";

        

        try {

            pst = conn.prepareStatement(sql);

            pst.setString(1, obj.getDataCompra());

            pst.setInt(2, obj.getFornecedor().getIdFornecedor());
            pst.setInt(3, obj.getProduto().getIdProduto());

            pst.setDouble(4, obj.getCompraPreco());
            pst.setDouble(5, obj.getCompraPrecoVenda());
            pst.setDouble(6, obj.getCompraValorTotal());
            pst.setString(7, obj.getCompraValidade());

            pst.setInt(8, obj.getIdCompra());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra alterada com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a compra " + erro);
        }

    }

    public void excluirCompra(CompraDTO obj) {
        String sql = "DELETE FROM tbl_compra WHERE id_compra = ?";

        

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getIdCompra());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra excluida com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a compra " + erro);
        }

    }

    public ArrayList<CompraDTO> listarCompra() {

        String sql = "SELECT"
                + " c.compra_data,"
                + " c.id_compra,"
                + " c.compra_preco,"
                + " c.compra_preco_venda,"
                + " c.compra_valor_total,"
                + " c.compra_validade,"
                + " f.forn_nome,"
                + " p.pro_cod_barra,"
                + " p.pro_nome,"
                + " p.pro_estoque"
                + " FROM tbl_compra as c"
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor)"
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)";


      

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("id_compra"));
                obj.setDataCompra(rs.getString("compra_data"));
                obj.setCompraPreco(rs.getDouble("compra_preco"));
                obj.setCompraPrecoVenda(rs.getDouble("compra_preco_venda"));
                obj.setCompraValorTotal(rs.getDouble("compra_valor_total"));
                obj.setCompraValidade(rs.getString("compra_validade"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));
                p.setEstoqueProduto(rs.getInt("p.pro_estoque"));

                obj.setFornecedor(f);
                obj.setProduto(p);

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CompraDAO LISTAR " + erro);
        }
        return null; // Esse metodo retorna toda a lista dos usuarios cadastrado
    }

    public ArrayList<CompraDTO> buscarCompraFornecedor(String forn_nome) {


        String sql = "SELECT"
                + " c.compra_data,"
                + " c.id_compra,"
                + " c.compra_preco,"
                + " c.compra_preco_venda,"
                + " c.compra_valor_total,"
                + " c.compra_validade,"
                + " f.forn_nome,"
                + " p.pro_cod_barra,"
                + " p.pro_nome,"
                + " p.pro_estoque"
                + " FROM tbl_compra as c"
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor)"
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)"
                + " WHERE f.forn_nome=?";

        conn = new Conexao().conectaBD();

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, forn_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt(" id_compra "));
                obj.setDataCompra(rs.getString(" compra_data "));
                obj.setCompraPreco(rs.getDouble(" compra_preco "));
                obj.setCompraPrecoVenda(rs.getDouble(" compra_preco_venda "));
                obj.setCompraValorTotal(rs.getDouble(" compra_valor_total "));
                obj.setCompraValidade(rs.getString(" compra_validade "));

                f.setNomeFornecedor(rs.getString(" f.forn_nome "));
                p.setNomeProduto(rs.getString(" p.pro_nome "));
                p.setCodbarraProduto(rs.getInt(" p.pro_cod_barra "));
                p.setEstoqueProduto(rs.getInt(" p.pro_estoque "));

                obj.setFornecedor(f);
                obj.setProduto(p);

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO em CompraDAO " + erro);
        }
        return null;

    }

    public ArrayList<CompraDTO> buscarCompraProdutoNome(String pro_nome) {

         String sql = "SELECT"
                + " c.compra_data,"
                + " c.id_compra,"
                + " c.compra_preco,"
                + " c.compra_preco_venda,"
                + " c.compra_valor_total,"
                + " c.compra_validade,"
                + " f.forn_nome,"
                + " p.pro_cod_barra,"
                + " p.pro_nome,"
                + " p.pro_estoque"
                + " FROM tbl_compra as c"
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor)"
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)"
                + "WHERE p.pro_nome=?";

        

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, pro_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("id_compra "));
                obj.setDataCompra(rs.getString("compra_data "));
                obj.setCompraPreco(rs.getDouble("compra_preco "));
                obj.setCompraPrecoVenda(rs.getDouble("compra_preco_venda "));
                obj.setCompraValorTotal(rs.getDouble("compra_valor_total "));
                obj.setCompraValidade(rs.getString("compra_validade "));

                f.setNomeFornecedor(rs.getString("f.forn_nome "));
                p.setNomeProduto(rs.getString("p.pro_nome "));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra "));
                p.setEstoqueProduto(rs.getInt("p.pro_estoque "));

                obj.setFornecedor(f);
                obj.setProduto(p);

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO CompraDAO " + erro);
        }
        return null;
    }

    public ArrayList<CompraDTO> buscarCompraProdutoCodigoBarra(int pro_cod_barra) {

        String sql = "SELECT"
                + " c.compra_data,"
                + " c.id_compra,"
                + " c.compra_preco,"
                + " c.compra_preco_venda,"
                + " c.compra_valor_total,"
                + " c.compra_validade,"
                + " f.forn_nome,"
                + " p.pro_cod_barra,"
                + " p.pro_nome,"
                + " p.pro_estoque"
                + " FROM tbl_compra as c"
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor)"
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)"
                + "WHERE p.pro_cod_barra=?";

        

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_cod_barra);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("id_compra "));
                obj.setDataCompra(rs.getString("compra_data "));
                obj.setCompraPreco(rs.getDouble("compra_preco "));
                obj.setCompraPrecoVenda(rs.getDouble("compra_preco_venda "));
                obj.setCompraValorTotal(rs.getDouble("compra_valor_total "));
                obj.setCompraValidade(rs.getString("compra_validade "));

                f.setNomeFornecedor(rs.getString("f.forn_nome "));
                p.setNomeProduto(rs.getString("p.pro_nome "));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra "));
                p.setEstoqueProduto(rs.getInt("p.pro_estoque "));

                obj.setFornecedor(f);
                obj.setProduto(p);

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO CompraDAO " + erro);
        }
        return null;
    }

    public void atualizarEstoque(int id_compra, int novo_estoque) {
        try {
            String sql = "SELECT fk_produto"
                    + " FROM tbl_compras as c "
                    + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)  "
                    + " UPDATE INTO tbl_compra "
                    + " SET p.pro_estoque=? "
                    + " WHERE id_compra=?";

            pst = conn.prepareStatement(sql);

            pst.setInt(1, novo_estoque);
            pst.setInt(2, id_compra);

            pst.execute();
            pst.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO CompraDAO: " + e);
        }
    }

}
