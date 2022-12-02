package DAO;

import CONEXAO.Conexao;
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
 *
 * @author Pri
 */
public class VendasDAO {

    /**
     * Método Venda serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar, Editar, Excluir e Listar as
     * informações no banco de dados na tabela vendas.
     */

    //Cria a Conexão
    Connection conn;
    // Prepara a Conexão, cria um obj para representar as instrucoes do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<VendasDTO> lista = new ArrayList<>();

    public VendasDAO() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    /**
     * Método Cadastrar:
     * Insere as informações no banco de dados nas colunas da tabela
     * vendas de acordo com os atributos informados pelo usuário.
     *
     * @param obj VendasDTO conecta com banco para inserir as informações.
     */
    public void cadastrarVenda(VendasDTO obj) {
        try {
//Através dos comandos SQL salva as informações nas colunas da tabela vendas no banco de dados.
            String sql = ""
                    + "INSERT INTO tbl_vendas( "
                    + "venda_data, "
                    + "fk_produto, "
                    + "fk_compra, "
                    + "venda_qnt, "
                    + "venda_valor,"
                    + "venda_desconto, "
                    + "venda_total) "
                    + "VALUES(?,?,?,?,?,?,?)";

            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);
            pst.setDate(1, (Date) obj.getDataVenda());

            pst.setInt(2, obj.getProduto().getIdProduto());
            pst.setInt(3, obj.getCompra().getIdCompra());
            pst.setInt(4, obj.getQntVenda());
            pst.setDouble(5, obj.getTotalVenda());
            pst.setDouble(6, obj.getDescontoVenda());
            pst.setDouble(7, obj.getTotalVenda());

            //Executar o comando SQL
            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

 /*
    
    
/**
 * Método Vendas:
 * Informa o valor total referente as vendas do dia.
 * @param venda_data vendas do dia
 * @return totalvendas, retorna o total das vendas do dia
 */

    //Método para calcular o total das vendas no dia 
 
    public double totalVendasNoDia(LocalDate venda_data) {
        try {
            double totalvendas = 0;

            String sql = ""
                    + "SELECT SUM(venda_total) AS total"
                    + "FROM tbl_vendas "
                    + "WHERE venda_data = ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1, venda_data.toString());

            rs = pst.executeQuery();

            if (rs.next()) {
                totalvendas = rs.getDouble("total");
            }
            return totalvendas;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
