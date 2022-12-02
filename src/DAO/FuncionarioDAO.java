package DAO;

import CONEXAO.Conexao;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    //Criando o metodo cadastrar

    Connection conn = new Conexao().conectaBD();
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();

    public void cadastrarFuncionario(FuncionarioDTO objfundto) {
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
            pst = conn.prepareStatement(sql);

            pst.setString(1, objfundto.getNomeFuncionario());
            pst.setString(2, objfundto.getCpfFuncionario());
            pst.setString(3, objfundto.getRgFuncionario());
            pst.setString(4, objfundto.getNascimentoFucionario());
            pst.setString(5, objfundto.getCelularFuncionario());
            pst.setString(6, objfundto.getCargoFuncionario());
            pst.setString(7, objfundto.getAdmissaoFuncionario());
            pst.setString(8, objfundto.getCepFuncionario());
            pst.setString(9, objfundto.getRuaFuncionario());
            pst.setInt(10, objfundto.getNumeroFuncionario());
            pst.setString(11, objfundto.getBairroFuncionario());
            pst.setString(12, objfundto.getCidadeFuncionario());
            pst.setString(13, objfundto.getEstadoFuncionario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionario já cadastrado", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarFuncionario(FuncionarioDTO objfundto) {
        String sql = ""
                + "UPDATE tbl_funcionario SET "
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
            pst = conn.prepareStatement(sql);

            pst.setString(1, objfundto.getNomeFuncionario());
            pst.setString(2, objfundto.getCpfFuncionario());
            pst.setString(3, objfundto.getRgFuncionario());
            pst.setString(4, objfundto.getNascimentoFucionario());
            pst.setString(5, objfundto.getCelularFuncionario());
            pst.setString(6, objfundto.getCargoFuncionario());
            pst.setString(7, objfundto.getAdmissaoFuncionario());
            pst.setString(8, objfundto.getCepFuncionario());
            pst.setString(9, objfundto.getRuaFuncionario());
            pst.setInt(10, objfundto.getNumeroFuncionario());
            pst.setString(11, objfundto.getBairroFuncionario());
            pst.setString(12, objfundto.getCidadeFuncionario());
            pst.setString(13, objfundto.getEstadoFuncionario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Funcionario nao alterado, erro" + erro);
        }
    }

    public void excluirFuncionario(FuncionarioDTO objfundto) {
        String sql = "DELETE FROM tbl_funcionario "
                    + "WHERE id_funcionario = ?";

        
        try {
            pst = conn.prepareStatement(sql);

            pst.setInt(1, objfundto.getIdFuncionario());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionario, erro" + erro);
        }

    }

    public ArrayList<FuncionarioDTO> listarFuncionario() {
        String sql = "SELECT * "
                + "FROM tbl_funcionario ";

        try {
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

    public ArrayList<FuncionarioDTO> buscarFuncionario(String fun_nome) {
        String sql = "SELECT * FROM tbl_funcionario WHERE fun_nome = ? ";

        
        try {
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
