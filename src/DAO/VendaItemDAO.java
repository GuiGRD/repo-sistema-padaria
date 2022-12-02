package DAO;

import CONEXAO.Conexao;
import DTO.ProdutoDTO;
import DTO.VendaItensDTO;
import DTO.VendasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pri
 */
public class VendaItemDAO {

    //Cria a Conexão
    Connection conn;
    // Prepara a Conexão, cria um obj para representar as instrucoes do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<VendaItensDTO> lista = new ArrayList<>();

    /**
     * Método Venda Item serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar e Consultar as informações no
     * banco de dados na tabela venda itens.
     */
    public VendaItemDAO() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    /**
     * Método Cadastrar: Insere as informações no banco de dados nas colunas da
     * tabela venda itens de acordo com os atributos informados pelo usuário.
     *
     * @param obj VendaItensDTO conecta com banco para inserir as informações.
     */
    public void cadastrarVendaItens(VendaItensDTO obj) {
        try {
            //Através dos comandos SQL salva as informações nas colunas da tabela itens de venda no banco de dados.
            String sql = ""
                    + "INSERT INTO tbl_venda_itens( "
                    + "fk_venda, "
                    + "fk_produto, "
                    + "venda_qnt, "
                    + "venda_subtotal) "
                    + "VALUES(?,?,?,?)";

            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getVenda().getIdVenda());
            pst.setInt(2, obj.getProduto().getIdProduto());
            pst.setInt(3, obj.getQntVenda());
            pst.setInt(4, obj.getSubtotalVenda());

            //Executar o comando SQL
            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    /**
     * Método Listar itens vendidos pelo id: Pega todas as informações do banco
     * de dados das colunas da tabela venda itens e retorna listando em uma
     * tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<VendaItensDTO> listarVendaItens(int id_venda) {
        //Através dos comandos SQL lista todas informações nas colunas da tabela venda itens no banco de dados.
        String sql = " "
                + " SELECT "
                + " p.pro_cod_barra, "
                + " p.pro_nome, "
                + " p.pro_preco_venda, "
                + " vi.venda_qnt, "
                + " vi.venda_subtotal "
                + " FROM tbl_venda_itens as vi"
                + " INNER JOIN tbl_produto AS p ON(vi.fk_produto = p.produto_id)"
                + " WHERE vi.fk_venda = ?";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                VendaItensDTO obj = new VendaItensDTO();
                ProdutoDTO p = new ProdutoDTO();

                p.setCodbarraProduto(rs.getInt("p.pro_cod_barra"));
                p.setNomeProduto(rs.getString("p.pro_nome"));
                p.setPrecoVendaProduto(rs.getInt("p.pro_preco_venda"));
                
                obj.setQntVenda(rs.getInt("vi.venda_qnt"));
                obj.setSubtotalVenda(rs.getInt("vi.venda_subtotal"));
                
                obj.setProduto(p);
                
                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendaItemDAO LISTAR " + erro);
            return null;
        }
    }
}
