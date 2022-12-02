/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import CONEXAO.Conexao;
import DTO.FornecedorDTO;
import VIEW.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Pri
 */

public class FornecedorDAOTest {
    //Cria a Conexão

    Connection conn;
    // Prepara a Conexão, cria um obj para representar as instrucoes do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<FornecedorDTO> lista = new ArrayList<>();

    public FornecedorDAOTest() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarFornecedor method, of class FornecedorDAO.
     */
    @Test
    public boolean testCadastrarFornecedor(FornecedorDTO objforndto) {
        //Através dos comandos SQL salva as informações nas colunas da tabela fornecedor no banco de dados.
        String sql = ""
                + "INSERT INTO tbl_fornecedor( "
                + "forn_nome, "
                + "forn_cnpj, "
                + "forn_celular, "
                + "forn_cep, "
                + "forn_rua, "
                + "forn_numero,"
                + "forn_bairro, "
                + "forn_cidade, "
                + "forn_estado) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com a ordem dos nome das colunas informadas na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, objforndto.getNomeFornecedor());
            pst.setString(2, objforndto.getCnpjFornecedor());
            pst.setString(3, objforndto.getCelularFornecedor());
            pst.setString(4, objforndto.getCepFornecedor());
            pst.setString(5, objforndto.getRuaFornecedor());
            pst.setInt(6, objforndto.getNumeroFornecedor());
            pst.setString(7, objforndto.getBairroFornecedor());
            pst.setString(8, objforndto.getCidadeFornecedor());
            pst.setString(9, objforndto.getEstadoFornecedor());

            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            //em caso de erro o retorno do teste sera falso
            return false;
        }
        //Se rodar sem erro o retorno do teste sera verdadeiro
        return true;

    }

    /**
     * Test of editarFornecedor method, of class FornecedorDAO.
     */
    @Test
    public boolean testEditarFornecedor(FornecedorDTO objforndto) {
        //Através dos comandos SQL edita as informações nas colunas da tabela fornecedor no banco de dados.
        String sql = ""
                + "UPDATE tbl_fornecedor "
                + "SET "
                + "forn_nome=?, "
                + "forn_cnpj=?, "
                + "forn_celular=?, "
                + "forn_cep=?, "
                + "forn_rua=?, "
                + "forn_numero=?,"
                + "forn_bairro=?, "
                + "forn_cidade=?, "
                + "forn_estado=? "
                + "WHERE id_fornecedor=?";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo e na ordem dos nome das colunas informadas na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, objforndto.getNomeFornecedor());
            pst.setString(2, objforndto.getCnpjFornecedor());
            pst.setString(3, objforndto.getCelularFornecedor());
            pst.setString(4, objforndto.getCepFornecedor());
            pst.setString(5, objforndto.getRuaFornecedor());
            pst.setInt(6, objforndto.getNumeroFornecedor());
            pst.setString(7, objforndto.getBairroFornecedor());
            pst.setString(8, objforndto.getCidadeFornecedor());
            pst.setString(9, objforndto.getEstadoFornecedor());
            pst.setInt(10, objforndto.getIdFornecedor());

            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            return false;
        }
        return true;
    }

    /**
     * Test of excluirFornecedor method, of class FornecedorDAO.
     */
    
    @Test
    public void testExcluirFornecedor(FornecedorDTO objforndto) {
        //Através dos comandos SQL exclui as informações nas colunas da tabela funcionário no banco de dados.
        String sql = ""
                + "DELETE FROM tbl_fornecedor "
                + "WHERE id_fornecedor = ? ";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com o  nome da coluna informada na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objforndto.getIdFornecedor());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionario nao alterado, erro", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Test of listarFornecedor method, of class FornecedorDAO.
     */
    @Test
    public ArrayList<FornecedorDTO> testListarFornecedor() {

        //Através dos comandos SQL lista todas informações nas colunas da tabela fornecedor no banco de dados.
        String sql = ""
                + "SELECT * "
                + "FROM tbl_fornecedor ";

        try {

            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                FornecedorDTO objforndto = new FornecedorDTO();

                objforndto.setIdFornecedor(rs.getInt("id_fornecedor"));
                objforndto.setNomeFornecedor(rs.getString("forn_nome"));
                objforndto.setCnpjFornecedor(rs.getString("forn_cnpj"));
                objforndto.setCelularFornecedor(rs.getString("forn_celular"));
                objforndto.setCepFornecedor(rs.getString("forn_cep"));
                objforndto.setRuaFornecedor(rs.getString("forn_rua"));
                objforndto.setNumeroFornecedor(rs.getInt("forn_numero"));
                objforndto.setBairroFornecedor(rs.getString("forn_bairro"));
                objforndto.setCidadeFornecedor(rs.getString("forn_cidade"));
                objforndto.setEstadoFornecedor(rs.getString("forn_estado"));

                lista.add(objforndto);
            }
            return lista;

        } catch (SQLException erro) {

            return null;
        }

    }

    /**
     * Test of buscarFornecedor method, of class FornecedorDAO.
     */
    @Test
    public ArrayList<FornecedorDTO> testBuscarFornecedor(String forn_nome) {

        //Através dos comandos SQL lista específicando o nome, e todas as informacoes nas colunas da tabela fornecedor no banco de dados.
        String sql = "SELECT * "
                + "FROM tbl_fornecedor "
                + "WHERE forn_nome LIKE ? ";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, forn_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                FornecedorDTO objforndto = new FornecedorDTO();

                objforndto.setIdFornecedor(rs.getInt("id_fornecedor"));
                objforndto.setNomeFornecedor(rs.getString("forn_nome"));
                objforndto.setCnpjFornecedor(rs.getString("forn_cnpj"));
                objforndto.setCelularFornecedor(rs.getString("forn_celular"));
                objforndto.setCepFornecedor(rs.getString("forn_cep"));
                objforndto.setRuaFornecedor(rs.getString("forn_rua"));
                objforndto.setNumeroFornecedor(rs.getInt("forn_numero"));
                objforndto.setBairroFornecedor(rs.getString("forn_bairro"));
                objforndto.setCidadeFornecedor(rs.getString("forn_cidade"));
                objforndto.setEstadoFornecedor(rs.getString("forn_estado"));

                lista.add(objforndto);
            }
            return lista;

        } catch (SQLException erro) {

            return null;
        }

    }

    /**
     * Test of CBXlistarNomeFornecedor method, of class FornecedorDAO.
     */
    @Test
    public ResultSet testCBXlistarNomeFornecedor() {
        //Através dos comandos SQL lista, ordenado pelo nome, todas as informacoes nas colunas da tabela fornecedor no banco de dados.
        String sql = "SELECT * "
                + "FROM tbl_fornecedor "
                + "ORDER BY forn_nome ";
        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            return pst.executeQuery();

        } catch (SQLException erro) {
            return null;
        }

    }

}
