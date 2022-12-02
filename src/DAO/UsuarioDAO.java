package DAO;

import CONEXAO.Conexao;
import DTO.UsuarioDTO;
import DTO.FuncionarioDTO;
import VIEW.MENUADM;
import VIEW.MENUCAIXA;
import VIEW.MENUESCRITORIO;
import java.awt.Color;
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
public class UsuarioDAO {

    public String LoginUsuario;
    
    //Cria a Conexão
    Connection conn = new Conexao().conectaBD();
    // Prepara a Conexão, cria um objeto para representar as instruções do SQL que será executada.
    PreparedStatement pst;
    //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<UsuarioDTO> lista = new ArrayList<>();

    /**
     * Método Usuário serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar, Editar, Excluir e Listar as
     * informações no banco de dados na tabela usuário.
     */
    public ResultSet autenticarUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "SELECT usu_perfil "
                + "FROM tbl_usuario "
                + "WHERE usu_login = ? "
                + "AND usu_senha = ? ";

        try {
            conn = new Conexao().conectaBD();
            pst = conn.prepareStatement(sql);
            pst.setString(1, objusuariodto.getLoginUsuario());// preenche os valores (1 = ao 1º ponto de ? informado na minha String sql)
            pst.setString(2, objusuariodto.getSenhaUsuario());

            rs = pst.executeQuery();// executa  Query( consulta)
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }

    /**
     * Método Cadastrar: Insere as informações no banco de dados nas colunas da
     * tabela usuário de acordo com os atributos informados pelo usuário.
     *
     * @param objusuariodto UsuarioDTO conecta com banco para inserir as
     * informações.
     */
    public void cadastrarUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "INSERT INTO tbl_usuario"
                + "fk_funcionario, "
                + "usu_login, "
                + "usu_senha, "
                + "usu_perfil "
                + "VALUES (?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objusuariodto.getFuncionario().getIdFuncionario());
            pst.setString(2, objusuariodto.getLoginUsuario());
            pst.setString(3, objusuariodto.getSenhaUsuario());
            pst.setString(4, objusuariodto.getPerfilUsuario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário " + erro);
        }

    }

    /**
     * Método Editar: Altera as informações no banco de dados na tabela usuário
     * de acordo com os atributos informados pelo usuário.
     *
     * @param objusuariodto UsuarioDTO conecta com banco para fazer as
     * alterações das informações.
     */
    public void editarUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "UPDATE tbl_usuario"
                + "SET "
                + "fk_funcionario = ?, "
                + "usu_login=?, "
                + "usu_senha=?, "
                + "usu_perfil=? "
                + "WHERE id_usuario = ? ";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objusuariodto.getFuncionario().getIdFuncionario());
            pst.setString(2, objusuariodto.getLoginUsuario());
            pst.setString(3, objusuariodto.getSenhaUsuario());
            pst.setString(4, objusuariodto.getPerfilUsuario());
            pst.setInt(5, objusuariodto.getIdUsuario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuário " + erro);
        }
    }

    /**
     * Método Excluir: Exclui as informações no banco de dados nas colunas da
     * tabela usuário informado pelo usuário.
     *
     * @param objusuariodto UsuarioDTO conecta com banco para excluir as
     * informações.
     */
    public void excluirUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "DELETE FROM tbl_usuario "
                + "WHERE id_usuario = ? ";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objusuariodto.getIdUsuario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuário não selecionado para exclusão " + erro);
        }
    }

    /**
     * Método Listar: Pega as informações do banco de dados das colunas da
     * tabela usuário e retorna listando em uma tabela para o usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<UsuarioDTO> listarUsuario() //traz as informações do banco de dados da tabela em questão retonando em uma lista
    {
        String sql = ""
                + "SELECT * "
                + "FROM tbl_usuario AS u "
                + "INNER JOIN tbl_funcionario AS f "
                + "ON u.fk_funcionario = f.id_funcionario ";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuarioDTO obj = new UsuarioDTO();
                FuncionarioDTO fundto = new FuncionarioDTO();

                obj.setIdUsuario(rs.getInt("u.id_usuario"));
                obj.setLoginUsuario(rs.getString("u.usu_login"));
                obj.setSenhaUsuario(rs.getString("u.usu_senha"));
                obj.setPerfilUsuario(rs.getString(" u.usu_perfil"));

                fundto.setNomeFuncionario(rs.getString("f.fun_nome"));
                fundto.setCpfFuncionario(rs.getString("f.fun_cpf"));

                obj.setFuncionario(fundto);
                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " Listar USUARIODAO " + erro);
            return null;
        }
        // Esse metodo retorna toda a lista dos usuarios cadastrado

    }

    /**
     * Método Buscar: Pega as informações do usuário escolhido no banco de dados
     * das colunas da tabela usuário e retorna listando em uma tabela para o
     * usuário.
     *
     * @return lista retorna a lista com as informações do banco.
     */
    public ArrayList<UsuarioDTO> buscarUsuario(String fun_nome) {
        String sql = "SELECT "
                + "u.fk_funcionario, "
                + "u.usu_login, "
                + "u.usu_senha, "
                + "u.usu_perfil, "
                + "f.fun_nome, "
                + "f.fun_cpf "
                + "FROM tbl_usuario AS u "
                + "INNER JOIN tbl_funcionario AS f "
                + "ON (u.fk_funcionario = f.id_funcionario) "
                + "WHERE f.fun_nome LIKE ? ";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, fun_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuarioDTO obj = new UsuarioDTO();
                FuncionarioDTO fundto = new FuncionarioDTO();

                obj.setIdUsuario(rs.getInt("u.id_usuario "));
                obj.setLoginUsuario(rs.getString("u.usu_login "));
                obj.setSenhaUsuario(rs.getString("u.usu_senha "));
                obj.setPerfilUsuario(rs.getString("u.usu_perfil "));

                fundto.setNomeFuncionario(rs.getString("f.fun_nome "));
                fundto.setCpfFuncionario(rs.getString("f.fun_cpf "));

                obj.setFuncionario(fundto);
                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuário não selecionado para busca " + erro);
            return null;
        }
        // Esse metodo retorna o usuario cadastrado

    }

    /**
     * Método Logar; Compara com o banco as informações passada pelo usuário
     *
     * @param Login Compara com o banco as informações passada pelo usuário
     * @param Senha Compara com o banco as informações passada pelo usuário
     */
    public void LogarUsuario(String Login, String Senha) {

        try {
            String sql = ""
                    + "SELECT * "
                    + "FROM tbl_usuario "
                    + "WHERE usu_login = ? "
                    + "AND usu_senha = ?";

            conn = new Conexao().conectaBD();
            pst = conn.prepareStatement(sql);

            pst.setString(1, Login);// preenche os valores (1 = ao 1º ponto de ? informado na minha String sql)
            pst.setString(2, Senha);

            rs = pst.executeQuery();// executa  Query(consulta)

            //Se existir um usuário e senha correspondente
            if (rs.next()) {
                //Fazendo o tratamento do perfil do usuario
                String cargo;
                cargo = rs.getString("usu_perfil");

                if (cargo == "Adm") {
                    //if(cargo.equals("Adm")){
                    JOptionPane.showMessageDialog(null, "Bem vindo(a)");
                    MENUADM menuA = new MENUADM();
                    menuA.setVisible(true);

                    menuA.LoginUsuario = rs.getString("usu_login");
                    MENUADM.lblUsuario.setForeground(Color.BLUE);

                }
                if (cargo == "Caixa") {
                    //} else if (cargo.equals("Caixa")){
                    JOptionPane.showMessageDialog(null, "Bem vindo(a)");

                    MENUCAIXA menuC = new MENUCAIXA();
                    menuC.setVisible(true);

                    menuC.LoginUsuario = rs.getString("usu_login");
                    MENUCAIXA.lblUsuario.setForeground(Color.gray);

                } else if (cargo == "Escritorio") {
                    //} else if (cargo.equals("Escritorio")){
                    JOptionPane.showMessageDialog(null, " Bem vindo(a)");

                    MENUESCRITORIO menuE = new MENUESCRITORIO();
                    menuE.setVisible(true);

                    menuE.LoginUsuario = rs.getString(" usu_login");
                    MENUESCRITORIO.lblUsuario.setForeground(Color.gray);
                }

            } else {
                //Envia mensagem dizendo que está incorreto.(usuario e/ou senha incorreto)
                JOptionPane.showMessageDialog(null, "Usuário e/ou Senha Inválida");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "TELALOGIN3" + erro);
        }

    }

}
