package DAO;

import CONEXAO.Conexao;
import DTO.FuncionarioDTO;
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
public class FuncionarioDAO {

    /**
     * Método Funcionário, serão utilizados os atributos que foram encapsulados
     * em getters e setters no DTO para: Cadastrar, Editar, Excluir e Listar as
     * informações no banco de dados na tabela funcionário.
     */
    //Cria a Conexão
    Connection conn;
    // Prepara a Conexão, cria um objeto para representar as instruções do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados.
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados.
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public FuncionarioDAO() {
        //Conecta com o banco de dados
        conn = new Conexao().conectaBD();
    }

    /**
     * Método Cadastrar: Insere as informações no banco de dados nas colunas da
     * tabela funcionário de acordo com os atributos informados pelo usuário.
     *
     * @param obj FuncionarioDTO conecta com banco para inserir as informações.
     */
    public void cadastrarFuncionario(FuncionarioDTO obj) {

        //Através dos comandos SQL salva as informações nas colunas da tabela funcionário no banco de dados.
        String sql = ""
                + "INSERT INTO tbl_funcionario"
                + "(fun_nome, "
                + "fun_cpf, "
                + "fun_rg, "
                + "fun_nascimento, "
                + "fun_celular, "
                + "fun_cargo, "
                + "fun_data_entrada, "
                + "fun_cep, "
                + "fun_rua, "
                + "fun_numero, "
                + "fun_bairro, "
                + "fun_cidade, "
                + "fun_estado)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com a ordem dos nome das colunas informadas na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, obj.getNomeFuncionario());
            pst.setString(2, obj.getCpfFuncionario());
            pst.setString(3, obj.getRgFuncionario());
            pst.setString(4, obj.getNascimentoFucionario());
            pst.setString(5, obj.getCelularFuncionario());
            pst.setString(6, obj.getCargoFuncionario());
            pst.setString(7, obj.getAdmissaoFuncionario());
            pst.setString(8, obj.getCepFuncionario());
            pst.setString(9, obj.getRuaFuncionario());
            pst.setInt(10, obj.getNumeroFuncionario());
            pst.setString(11, obj.getBairroFuncionario());
            pst.setString(12, obj.getCidadeFuncionario());
            pst.setString(13, obj.getEstadoFuncionario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionario já cadastrado", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método Editar: Altera as informações no banco de dados na tabela
     * funcionário de acordo com as atributos informados pelo usuário.
     *
     * @param obj FuncionarioDTO conecta com banco para fazer as alterações das
     * informações.
     */
    public void editarFuncionario(FuncionarioDTO obj) {

        //Através dos comandos SQL edita as informações nas colunas da tabela funcionário no banco de dados.
        String sql = ""
                + "UPDATE tbl_funcionario "
                + "SET "
                + "fun_nome=?, "
                + "fun_cpf=?, "
                + "fun_rg=?, "
                + "fun_nascimento=?, "
                + "fun_celular=?, "
                + "fun_cargo=?, "
                + "fun_data_entrada=?, "
                + "fun_cep=?, "
                + "fun_rua=?, "
                + "fun_numero=?, "
                + "fun_bairro=?, "
                + "fun_cidade=?, "
                + "fun_estado=? "
                + "WHERE id_funcionario=?";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo e na ordem dos nome das colunas informadas na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, obj.getNomeFuncionario());
            pst.setString(2, obj.getCpfFuncionario());
            pst.setString(3, obj.getRgFuncionario());
            pst.setString(4, obj.getNascimentoFucionario());
            pst.setString(5, obj.getCelularFuncionario());
            pst.setString(6, obj.getCargoFuncionario());
            pst.setString(7, obj.getAdmissaoFuncionario());
            pst.setString(8, obj.getCepFuncionario());
            pst.setString(9, obj.getRuaFuncionario());
            pst.setInt(10, obj.getNumeroFuncionario());
            pst.setString(11, obj.getBairroFuncionario());
            pst.setString(12, obj.getCidadeFuncionario());
            pst.setString(13, obj.getEstadoFuncionario());
            pst.setInt(14, obj.getIdFuncionario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o Funcionario" + erro);
        }
    }

    /**
     * Método Excluir: Exclui as informações no banco de dados nas colunas da
     * tabela funcionário informado pelo usuário.
     *
     * @param obj FuncionarioDTO conecta com banco para excluir as informações.
     */
    public void excluirFuncionario(FuncionarioDTO obj) {
        //Através dos comandos SQL exclui as informações nas colunas da tabela funcionário no banco de dados.
        String sql = ""
                + "DELETE FROM tbl_funcionario "
                + "WHERE id_funcionario = ?";

        try {
            //Conecta no banco e prepara organizando o comando SQL de acordo com o  nome da coluna informada na String SQL.
            pst = conn.prepareStatement(sql);

            pst.setInt(1, obj.getIdFuncionario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionario, erro" + erro);
        }

    }

    /**
     * Método Listar: Pega as informações do banco de dados das colunas da
     * tabela funcionário e retorna listando em uma tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<FuncionarioDTO> listarFuncionario() {
        //Através dos comandos SQL lista todas informações nas colunas da tabela funcionário no banco de dados.
        String sql = ""
                + "SELECT * "
                + "FROM tbl_funcionario ";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                FuncionarioDTO obj = new FuncionarioDTO();
                
                obj.setIdFuncionario(rs.getInt("id_funcionario"));
                obj.setNomeFuncionario(rs.getString("fun_nome"));
                obj.setCpfFuncionario(rs.getString("fun_cpf"));
                obj.setRgFuncionario(rs.getString("fun_rg"));
                obj.setNascimentoFucionario(rs.getString("fun_nascimento"));
                obj.setCelularFuncionario(rs.getString("fun_celular"));
                obj.setCargoFuncionario(rs.getString("fun_cargo"));
                obj.setAdmissaoFuncionario(rs.getString("fun_data_entrada"));
                obj.setCepFuncionario(rs.getString("fun_cep"));
                obj.setRuaFuncionario(rs.getString("fun_rua"));
                obj.setNumeroFuncionario(rs.getInt("fun_numero"));
                obj.setBairroFuncionario(rs.getString("fun_bairro"));
                obj.setCidadeFuncionario(rs.getString("fun_cidade"));
                obj.setEstadoFuncionario(rs.getString("fun_estado"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionário não informado para busca " + erro);
            return null;
        }

    }

    /**
     * Método Buscar: Pega as informações do funcionario escolhido no banco de
     * dados das colunas da tabela funcionário e retorna listando em uma tabela
     * para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<FuncionarioDTO> buscarFuncionario(String fun_nome) {
        //Através dos comandos SQL lista específicando o nome, e todas as informacoes nas colunas da tabela funcionário no banco de dados.
        String sql = "SELECT * "
                + "FROM tbl_funcionario "
                + "WHERE fun_nome = ? ";

        try {
            //Conecta no banco e prepara organizando o comando SQL.
            pst = conn.prepareStatement(sql);

            pst.setString(1, fun_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                FuncionarioDTO obj = new FuncionarioDTO();
                obj.setIdFuncionario(rs.getInt("id_funcionario"));
                obj.setNomeFuncionario(rs.getString("fun_nome"));
                obj.setCpfFuncionario(rs.getString("fun_cpf"));
                obj.setRgFuncionario(rs.getString("fun_rg"));
                obj.setNascimentoFucionario(rs.getString("fun_nascimento"));
                obj.setCelularFuncionario(rs.getString("fun_celular"));
                obj.setCargoFuncionario(rs.getString("fun_cargo"));
                obj.setAdmissaoFuncionario(rs.getString("fun_data_entrada"));
                obj.setCepFuncionario(rs.getString("fun_cep"));
                obj.setRuaFuncionario(rs.getString("fun_rua"));
                obj.setNumeroFuncionario(rs.getInt("fun_numero"));
                obj.setBairroFuncionario(rs.getString("fun_bairro"));
                obj.setCidadeFuncionario(rs.getString("fun_cidade"));
                obj.setEstadoFuncionario(rs.getString("fun_estado"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionário não informado para busca " + erro);
            return null;
        }

    }
}
