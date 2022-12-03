/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import CONEXAO.Conexao;
import DTO.FuncionarioDTO;
import DTO.UsuarioDTO;
import VIEW.MENUADM;
import VIEW.MENUCAIXA;
import VIEW.MENUESCRITORIO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pri
 */
public class UsuarioDAOTest {

    public UsuarioDAOTest() {

    }

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
                + "SELECT * "
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
    public boolean cadastrarUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "INSERT INTO tbl_usuario "
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

        } catch (SQLException erro) {
            return false;
        }
        return true;

    }

    public boolean editarUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "UPDATE tbl_usuario "
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

        } catch (SQLException erro) {
            return false;
        }
        return true;
    }

    public boolean excluirUsuario(UsuarioDTO objusuariodto) {
        String sql = ""
                + "DELETE FROM tbl_usuario "
                + "WHERE id_usuario = ? ";

        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objusuariodto.getIdUsuario());

            pst.execute();
            pst.close();

        } catch (SQLException erro) {
            return false;
        }
        return true;
    }

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

            return null;
        }
        // Esse metodo retorna toda a lista dos usuarios cadastrado

    }

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

    public boolean LogarUsuario(String Login, String Senha) {

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
                    //if (rs.getString("usu_perfil").equals("Adm")) {

                    return true;

                } else if (cargo == "Caixa") 
                    //} else if (rs.getString("usu_perfil").equals("Caixa")) {

                {
                    return true;
                } else if (rs.getString("usu_perfil") == "Escritorio") {
                    //} else if (rs.getString("usu_perfil").equals("Escritorio")) {


                    return true;
                }
            } else {
                return false;
            }

        } catch (SQLException ex) {
            return false;
        }
        return true;

    }
}
