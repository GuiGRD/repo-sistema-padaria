package DAO;

import CONEXAO.Conexao;
import DTO.VendasDTO;
import java.sql.Connection;
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

    //Cria a Conexão
    Connection conn;
    // Prepara a Conexão, cria um obj para representar as instrucoes do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<VendasDTO> lista = new ArrayList<>();

    /**
     * Método Venda serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar e Consultar as informações no
     * banco de dados na tabela vendas.
     */
    public VendasDAO() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    /**
     * Método Cadastrar: Insere as informações no banco de dados nas colunas da
     * tabela vendas de acordo com os atributos informados pelo usuário.
     *
     * @param obj VendasDTO conecta com banco para inserir as informações.
     */
    public void cadastrarVenda(VendasDTO obj) {
        try {
            //Através dos comandos SQL salva as informações nas colunas da tabela vendas no banco de dados.
            String sql = ""
                    + "INSERT INTO tbl_venda( "
                    + "venda_data, "
                    + "venda_total) "
                    + "VALUES(?,?)";

            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);
            pst.setString(1, obj.getDataVenda());
            pst.setInt(2, obj.getTotalVenda());

            //Executar o comando SQL
            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    /**
     * Método Listar: Pega todas as informações do banco de dados das colunas da
     * tabela venda e retorna listando em uma tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<VendasDTO> listarVenda() {//Através dos comandos SQL lista todas informações nas colunas da tabela venda no banco de dados.
        String sql = " "
                + " SELECT "
                + " date_format(data_venda,'%d/%m/%Y') as data_format ,"
                + " total_venda "
                + " FROM tbl_venda ";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                VendasDTO obj = new VendasDTO();

                obj.setIdVenda(rs.getInt("v.id_venda"));
                obj.setDataVenda(rs.getString("data_format"));
                obj.setTotalVenda(rs.getInt("v.venda_total"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendaDAO LISTAR " + erro);
            return null;
        }
    }

    /**
     * Método Vendas: Informa o valor total referente as vendas do dia.
     *
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
