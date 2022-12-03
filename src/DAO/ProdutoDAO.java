package DAO;

import CONEXAO.Conexao;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pri
 */
public class ProdutoDAO {

    //Cria a Conexão
    Connection conn;
    // Prepara a Conexão, cria um objeto para representar as instruções do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<ProdutoDTO> lista = new ArrayList<>();

    /**
     * Método Produto serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar, Editar, Excluir e Listar as
     * informações no banco de dados na tabela produto.
     */
    public ProdutoDAO() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    /**
     * Método Cadastrar: Insere as informações no banco de dados nas colunas da
     * tabela produto de acordo com os atributos informados pelo usuário.
     *
     * @param obj ProdutoDTO conecta com banco para inserir as informações.
     */
    public void cadastrarProduto(ProdutoDTO obj) {
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

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso ");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto, verifique se todos os campos foram preenchidos\n  " + erro);
        }
    }

    /**
     * Método Editar: Altera as informações no banco de dados na tabela produto
     * de acordo com os atributos informados pelo usuário.
     *
     * @param obj ProdutoDTO conecta com banco para fazer as alterações das
     * informações.
     */
    public void editarProduto(ProdutoDTO obj) {
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

            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o produto " + erro);
        }
    }

    /**
     * Método Excluir: Exclui as informações no banco de dados nas colunas da
     * tabela produto informado pelo usuário.
     *
     * @param obj ProdutoDTO conecta com banco para excluir as informações.
     */
    public void excluirProduto(ProdutoDTO obj) {
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

            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o produto " + erro);
        }

    }

    /**
     * Método Listar: Pega todas as informações do banco de dados das colunas da
     * tabela produto e retorna listando em uma tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
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

                ProdutoDTO objdto = new ProdutoDTO();

                objdto.setIdProduto(rs.getInt("id_produto"));
                objdto.setCodbarraProduto(rs.getInt("pro_cod_barra"));
                objdto.setNomeProduto(rs.getString("pro_nome"));
                objdto.setEstoqueProduto(rs.getInt("pro_estoque"));
                objdto.setPrecoVendaProduto(rs.getInt("pro_preco_venda"));

                lista.add(objdto);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar o ProdutoDAO" + erro);
            return null;
        }

    }

    /**
     * Método Buscar: Pega as informações do produto escolhido no banco de dados
     * das colunas da tabela produto e retorna listando em uma tabela para o
     * usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
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
            JOptionPane.showMessageDialog(null, "PRODUTODAO - Produto não selecionado para busca " + erro);
            return null;
        }
    }

    /**
     * Método Buscar: Pega as informações do codigo do produto escolhido no
     * banco de dados das colunas da tabela produto e retorna listando em uma
     * tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<ProdutoDTO> buscarCodigoProduto(int codigo) {
        //Através dos comandos SQL lista específicando o nome, e todas as informacoes nas colunas da tabela produto no banco de dados.
        String sql = "SELECT * "
                + "FROM tbl_produto "
                + "WHERE pro_cod_barra = ? ";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, codigo);
            rs = pst.executeQuery();
            ProdutoDTO obj = new ProdutoDTO();

            if (rs.next()) {

                obj.setIdProduto(rs.getInt("id_produto"));
                obj.setCodbarraProduto(rs.getInt("pro_cod_barra"));
                obj.setNomeProduto(rs.getString("pro_nome"));
                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            
            return null;
        }

    }

    /**
     * Método Atualizar: Realiza as alterações dos novas quantidades de produtos
     * que entraram ao estoque. Realiza as alterações das novas quantidades de
     * produtos vendidos que sairam do estoque.
     *
     * @param pro_estoque nova quantidade de produtos no estoque
     */
    public void atualizarEstoque(int id_produto, int pro_estoque) {
//Através dos comandos SQL atualiza o produto com todas as informacoes nas colunas da tabela produto no banco de dados.
        String sql = "UPDATE tbl_produto "
                + "SET pro_estoque = ? "
                + "WHERE id_produto = ?";

        try {
//Conecta no banco e prepara organizando o comando SQL.
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
     * Método Atual: Retorna o estoque atual de um produto específico.
     */
    public int retornaEstoqueAtual(int id_produto) {
//Através dos comandos SQL lista específicando a quantidade do produto atualizada, e todas as informacoes nas colunas da tabela produto no banco de dados.
        int estoque = 0;
        String sql = "SELECT pro_estoque "
                + "FROM tbl_produto"
                + "wHERE id_produto=?";
        try {
//Conecta no banco e prepara organizando o comando SQL.
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

    /**
     * Método VendasDia: Retorna os produtos mais vendidos no dia
     */
    public int produtosVendasNoDia(int pro_cod_barra) {
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

            if (rs.next()) {
                produtovendas = rs.getInt("cod");
            }
            return produtovendas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
