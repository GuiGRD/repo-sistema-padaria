package DAO;

import CONEXAO.Conexao;
import DTO.FornecedorDTO;
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

    /**
     * Metodo Fornecedor, serao utilizados os atributos que foram encapsulados
     * em getters e setters no DTO para: Cadastrar, Editar, Excluir e Listar as
     * informacoes no banco de dados na tabela fornecedor.
     */
public class FornecedorDAO {

    /**
     * Metodo Fornecedor, serao utilizados os atributos que foram encapsulados
     * em getters e setters no DTO para: Cadastrar, Editar, Excluir e Listar as
     * informacoes no banco de dados na tabela fornecedor.
     */
    //Cria a Conexão
    Connection conn;
    // Prepara a Conexão, cria um obj para representar as instrucoes do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<FornecedorDTO> lista = new ArrayList<>();

    public FornecedorDAO() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    /**
     * Método Cadastrar: Insere as informações no banco de dados nas colunas da
     * tabela fornecedor de acordo com os atributos informados pelo usuário.
     *
     * @param objforndto FornecedorDTO conecta com banco para inserir as
     * informações.
     */
    public void cadastrarFornecedor(FornecedorDTO objforndto) {
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

            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso ");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o fornecedor " + erro);
        }

    }

    /**
     * Método Editar: Altera as informações no banco de dados na tabela
     * fornecedor de acordo com as atributos informados pelo usuário.
     *
     * @param objforndto FornecedorDTO conecta com banco para fazer as
     * alterações das informações.
     */
    public void editarFornecedor(FornecedorDTO objforndto) {
        //Através dos comandos SQL edita as informações nas colunas da tabela fornecedor no banco de dados.
        String sql = "UPDATE tbl_fornecedor SET "
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

            JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar fornecedor " + erro);
        }
    }

    /**
     * Método Excluir: Exclui as informações no banco de dados nas colunas da
     * tabela fornecedor informado pelo usuário.
     *
     * @param objforndto FornecedorDTO conecta com banco para excluir as
     * informações.
     */
    public void excluirFornecedor(FornecedorDTO objforndto) {
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
     * Método Listar: Pega todas as informações do banco de dados das colunas da
     * tabela fornecedor e retorna listando em uma tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<FornecedorDTO> listarFornecedor() {
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
            JOptionPane.showMessageDialog(null, "Erro ao listar o FornecedorDAO " + erro);
            return null;
        }

    }

    /**
     * Método Buscar: Pega as informações do fornecedor escolhido no banco de
     * dados das colunas da tabela fornecedor e retorna listando em uma tabela
     * para o usuário.
     * @param forn_nome informa o nome do fornecedor. 
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<FornecedorDTO> buscarFornecedor(String forn_nome) {
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
            JOptionPane.showMessageDialog(null, "Fornecedor não selecionado para busca " + erro);
            return null;
        }

    }
    
    /**
     * Método Listar Nome Fornecedor
     * Lista o nome do fornecedor para jogar na combobox
     * @return 
     */
        public ResultSet CBXlistarNomeFornecedor()
        {
        String sql = "SELECT * FROM tbl_fornecedor ORDER BY forn_nome ";
        try 
        {
            pst = conn.prepareStatement(sql);
            
            
            return pst.executeQuery();

            
        } catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, " ListarNomeFornecedorDAO" + erro);
            return null;
        }
        
    }

}
