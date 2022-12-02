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

public class CompraDAO {

    Connection conn = new Conexao().conectaBD();
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<CompraDTO> lista = new ArrayList<>();

    public void cadastrarCompra(CompraDTO obj) {
        String sql = ""
                + "INSERT INTO tbl_compra( "
                //+ "compra_data, "
                + "fk_fornecedor, "
                + "fk_produto, "
                + "compra_qnt, "
                + "compra_preco, "
                + "compra_preco_venda, "
                + "compra_valor_total) "
                + "VALUES (?,?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);

            //pst.setString(1, obj.getDataCompra());
            pst.setInt(1, obj.getFornecedor().getIdFornecedor());
            pst.setInt(2, obj.getProduto().getIdProduto());
            pst.setInt(3, obj.getCompraQnt());
            pst.setInt(4, obj.getCompraPreco());
            pst.setInt(5, obj.getCompraPrecoVenda());
            pst.setInt(6, obj.getCompraValorTotal());

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
               // + "compra_data = ?, "
                + "fk_fornecedor = ?, "
                + "fk_produto = ?, "
                + "compra_qnt =?, "
                + "compra_preco =?, "
                + "compra_preco_venda=?, "
                + "compra_valor_total=? "
                + "WHERE id_compra=?";

        try {

            pst = conn.prepareStatement(sql);

            //pst.setString(1, obj.getDataCompra());
            pst.setInt(1, obj.getFornecedor().getIdFornecedor());
            pst.setInt(2, obj.getProduto().getIdProduto());
            pst.setInt(3, obj.getCompraQnt());
            pst.setInt(4, obj.getCompraPreco());
            pst.setInt(5, obj.getCompraPrecoVenda());
            pst.setInt(6, obj.getCompraValorTotal());

            pst.setInt(7, obj.getIdCompra());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra alterada com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a compra " + erro);
        }

    }

    public void excluirCompra(CompraDTO obj) {
        String sql = ""
                + "DELETE FROM tbl_compra "
                + "WHERE id_compra = ?";

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

        String sql = " SELECT * "
                + " FROM tbl_compra as c "
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor) "
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));
                obj.setCompraQnt(rs.getInt("c.compra_qnt"));
                obj.setCompraPreco(rs.getInt("c.compra_preco"));
                obj.setCompraPrecoVenda(rs.getInt("c.compra_preco_venda"));
                obj.setCompraValorTotal(rs.getInt("c.compra_valor_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));

                obj.setFornecedor(f);
                obj.setProduto(p);

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CompraDAO LISTAR " + erro);
            return null;
        }
         // Esse metodo retorna toda a lista dos usuarios cadastrado
    }

    public ArrayList<CompraDTO> buscarCompraFornecedor(String forn_nome) {

        String sql = "SELECT *"
                + " FROM tbl_compra as c "
                + "INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor) "
                + "INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto) "
                + "WHERE f.forn_nome=?";

        conn = new Conexao().conectaBD();

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, forn_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));
                obj.setCompraQnt(rs.getInt("c.compra_qnt"));
                obj.setCompraPreco(rs.getInt("c.compra_preco"));
                obj.setCompraPrecoVenda(rs.getInt("c.compra_preco_venda"));
                obj.setCompraValorTotal(rs.getInt("c.compra_valor_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));

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

        String sql = "SELECT * "
                + "FROM tbl_compra as c "
                + "INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor) "
                + "INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto) "
                + "WHERE p.pro_nome=?";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, pro_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));
                obj.setCompraQnt(rs.getInt("c.compra_qnt"));
                obj.setCompraPreco(rs.getInt("c.compra_preco"));
                obj.setCompraPrecoVenda(rs.getInt("c.compra_preco_venda"));
                obj.setCompraValorTotal(rs.getInt("c.compra_valor_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));

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

        String sql = "SELECT * "
                + " FROM tbl_compra as c"
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor)"
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto)"
                + " WHERE p.pro_cod_barra=?";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_cod_barra);
            rs = pst.executeQuery();

            while (rs.next()) {
                CompraDTO obj = new CompraDTO();
                FornecedorDTO f = new FornecedorDTO();
                ProdutoDTO p = new ProdutoDTO();

                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));
                obj.setCompraQnt(rs.getInt("c.compra_qnt"));
                obj.setCompraPreco(rs.getInt("c.compra_preco"));
                obj.setCompraPrecoVenda(rs.getInt("c.compra_preco_venda"));
                obj.setCompraValorTotal(rs.getInt("c.compra_valor_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));

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

    public CompraDTO buscarCompraProduto(int pro_cod_barra) {

        String sql = "SELECT * "
                + " FROM tbl_compra as c"
                + " INNER JOIN tbl_fornecedor AS f ON(c.fk_fornecedor = f.id_fornecedor)"
                + " INNER JOIN tbl_produto AS p ON(c.fk_produto = p.id_produto) "
                + "WHERE p.pro_cod_barra=?";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, pro_cod_barra);
            rs = pst.executeQuery();

            CompraDTO obj = new CompraDTO();
            FornecedorDTO f = new FornecedorDTO();
            ProdutoDTO p = new ProdutoDTO();

            while (rs.next()) {

                obj.setIdCompra(rs.getInt("c.id_compra"));
                obj.setDataCompra(rs.getString("c.compra_data"));
                obj.setCompraQnt(rs.getInt("c.compra_qnt"));
                obj.setCompraPreco(rs.getInt("c.compra_preco"));
                obj.setCompraPrecoVenda(rs.getInt("c.compra_preco_venda"));
                obj.setCompraValorTotal(rs.getInt("c.compra_valor_total"));

                f.setNomeFornecedor(rs.getString("f.forn_nome"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));

                obj.setFornecedor(f);
                obj.setProduto(p);

            }
            return obj;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO buscarCompraDAO " + erro);
            return null;
        }

    }

    /*
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
    
     */
    public CompraDTO PesquisaCodProd(int pcode)
    {

        String sql = ""
                + "SELECT * "
                + "FROM tbl_compra as c "
                + "INNER JOIN tbl_produto as p "
                + "ON (c.fk_produto = p.id_produto)"
                + "WHERE (p.pro_cod_barra) = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, pcode);
            rs = pst.executeQuery();
            ProdutoDTO objp = new ProdutoDTO();
            CompraDTO objc = new CompraDTO();

            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Produto não Encontrado");
            } else {

                objp.setNomeProduto(rs.getString("p.pro_nome"));

                objc.setCompraPrecoVenda(rs.getInt("c.compra_preco_venda"));

                objc.setProduto(objp);

            }
            return objc;
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
}
