package DAO;

import CONEXAO.Conexao;
import DTO.UsuarioDTO;
import DTO.FuncionarioDTO;
import VIEW.MENUADM;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn ;

    PreparedStatement pst;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();
    public String LoginUsuario;

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

    public ArrayList<UsuarioDTO> listarUsuario() //traz as informações do banco de dados da tabela em questão retonando em uma lista
    {
        String sql = ""
                + "SELECT"
                + "u.fk_funcionario,"
                + "u.usu_login,"
                + "u.usu_senha,"
                + "u.usu_perfil,"
                + "f.fun_nome,"
                + "f.fun_cpf,"
                + "FROM tbl_usuario AS u "
                + "INNER JOIN tbl_funcionario AS f "
                + "ON u.fk_funcionario = f.id_funcionario ";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuarioDTO obj = new UsuarioDTO();
                FuncionarioDTO fundto = new FuncionarioDTO();

                obj.setIdUsuario(rs.getInt("u.id_usuario "));
                obj.setLoginUsuario(rs.getString("u.usu_login "));
                obj.setSenhaUsuario(rs.getString("u.usu_senha "));
                obj.setPerfilUsuario(rs.getString(" u.usu_perfil "));

                fundto.setNomeFuncionario(rs.getString("f.fun_nome "));
                fundto.setCpfFuncionario(rs.getString("f.fun_cpf "));

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

    public ArrayList<UsuarioDTO> buscarUsuario(String fun_nome) {
        String sql = "SELECT "
                + "u.fk_funcionario,"
                + "u.usu_login,"
                + "u.usu_senha,"
                + "u.usu_perfil,"
                + "f.fun_nome,"
                + "f.fun_cpf,"
                + "FROM tbl_usuario AS u "
                + "INNER JOIN tbl_funcionario AS f "
                + "ON u.fk_funcionario = f.id_funcionario "
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

    public ArrayList<UsuarioDTO> buscarPerfilUsuario(String usu_perfil) {
        String sql = ""
                + "SELECT "
                + "fk_funcionario "
                + "FROM tbl_usuario AS u"
                + "u.usu_login, "
                + "u.usu_senha, "
                + "u.usu_perfil, "
                + "f.fun_nome, "
                + "f.fun_cpf, "
                + "INNER JOIN tbl_funcionario AS f ON(u.fk_funcionario = f.id_funcionario)"
                + " WHERE u.usu_perfil LIKE ? ";

        conn = new Conexao().conectaBD();

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, usu_perfil);
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuarioDTO obj = new UsuarioDTO();
                FuncionarioDTO fundto = new FuncionarioDTO();

                obj.setIdUsuario(rs.getInt("u.id_usuario"));
                obj.setLoginUsuario(rs.getString("u.usu_login"));
                obj.setSenhaUsuario(rs.getString("u.usu_senha"));
                obj.setPerfilUsuario(rs.getString("u.usu_perfil"));

                fundto.setNomeFuncionario(rs.getString("f.fun_nome"));
                fundto.setCpfFuncionario(rs.getString("f.fun_cpf"));

                obj.setFuncionario(fundto);
                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Perfil do usuário não selecionado para busca " + erro);
            return null;
        }
        // Esse metodo retorna o usuario cadastrado

    }

    public UsuarioDTO PesquisarUsuario(String fun_nome) {

        String sql = "SELECT"
                + " u.usu_login,"
                + " u.usu_senha,"
                + " u.usu_perfil,"
                + " fk_funcionario,"
                + " f.fun_nome,"
                + " f.fun_cpf "
                + " FROM tbl_usuario AS u"
                + " INNER JOIN tbl_funcionario AS f ON(u.fk_funcionario = f.id_funcionario)"
                + " WHERE f.fun_nome LIKE ?";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, fun_nome);
            rs = pst.executeQuery();

            UsuarioDTO obj = new UsuarioDTO();
            FuncionarioDTO fundto = new FuncionarioDTO();

            if (rs.next()) {

                obj.setIdUsuario(rs.getInt("u.id_usuario"));
                obj.setLoginUsuario(rs.getString("u.usu_login"));
                obj.setSenhaUsuario(rs.getString("u.usu_senha"));
                obj.setPerfilUsuario(rs.getString("u.usu_perfil "));

                fundto.setNomeFuncionario(rs.getString("f.fun_nome"));
                fundto.setCpfFuncionario(rs.getString("f.fun_cpf"));

                obj.setFuncionario(fundto);

            }
            return obj;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Usuário não selecionado para pesquisa " + erro);
            return null;
        }

    }


}


