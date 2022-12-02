package DAO;

import CONEXAO.Conexao;
import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn = new Conexao().conectaBD();
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<ClienteDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClienteDTO obj) {
        String sql = ""
                + "INSERT INTO tbl_cliente("
                + "cli_nome, "
                + "cli_cpf, "
                + "cli_nasc, "
                + "cli_celular,"
                + "cli_cep, "
                + "cli_rua,"
                + "cli_numero,"
                + "cli_bairro,"
                + "cli_cidade,"
                + "cli_estado)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, obj.getNomeCliente());
            pst.setString(2, obj.getCpfCliente());
            pst.setString(3, obj.getNascCliente());
            pst.setString(4, obj.getCelularCliente());
            pst.setString(5, obj.getCepCliente());
            pst.setString(6, obj.getRuaCliente());
            pst.setInt(7, obj.getNumeroCliente());
            pst.setString(8, obj.getBairroCliente());
            pst.setString(9, obj.getCidadeCliente());
            pst.setString(10, obj.getEstadoCliente());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado " + erro);
        }

    }

    public void editarCliente(ClienteDTO obj) {
        String sql = ""
                + "UPDATE tbl_cliente"
                + " SET "
                + "cli_nome=?, "
                + "cli_cpf=?, "
                + "cli_nasc=?, "
                + "cli_celular=?, "
                + "cli_cep=?, "
                + "cli_rua=?, "
                + "cli_numero=?, "
                + "cli_bairro=?, "
                + "cli_cidade=?, "
                + "cli_estado=? "
                + "WHERE id_cliente=?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, obj.getNomeCliente());
            pst.setString(2, obj.getCpfCliente());
            pst.setString(3, obj.getNascCliente());
            pst.setString(4, obj.getCelularCliente());
            pst.setString(5, obj.getCepCliente());
            pst.setString(6, obj.getRuaCliente());
            pst.setInt(7, obj.getNumeroCliente());
            pst.setString(8, obj.getBairroCliente());
            pst.setString(9, obj.getCidadeCliente());
            pst.setString(10, obj.getEstadoCliente());
            pst.setInt(11, obj.getIdCliente());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar cliente " + erro);

        }
    }

    public void excluirCliente(ClienteDTO obj) {
        String sql = ""
                + "DELETE FROM tbl_cliente "
                + "WHERE id_cliente = ? ";

        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, obj.getIdCliente());

            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente com vinculo não pode ser excluido " + erro);
        }
    }
//Metodo retorna a lista de todos os clientes cadastrados 

    public ArrayList<ClienteDTO> listarCliente() {
        String sql = "SELECT * FROM tbl_cliente";

        try {

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                ClienteDTO objdto = new ClienteDTO();

                objdto.setIdCliente(rs.getInt("id_cliente"));
                objdto.setNomeCliente(rs.getString("cli_nome"));
                objdto.setCpfCliente(rs.getString("cli_cpf"));
                objdto.setNascCliente(rs.getString("cli_nasc"));
                objdto.setCelularCliente(rs.getString("cli_celular"));
                objdto.setCepCliente(rs.getString("cli_cep"));
                objdto.setRuaCliente(rs.getString("cli_rua"));
                objdto.setNumeroCliente(rs.getInt("cli_numero"));
                objdto.setBairroCliente(rs.getString("cli_bairro"));
                objdto.setCidadeCliente(rs.getString("cli_cidade"));
                objdto.setEstadoCliente(rs.getString("cli_estado"));
                
                lista.add(objdto);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente não selecionado para busca " + erro);
            return null;
        }

    }

    //Metodo busca e retorna a lista apenas do nome informado listando todas as informacoes do mesmo cadastradas no banco
    public ArrayList<ClienteDTO> buscarCliente(String cli_nome) {

        String sql = ""
                + "SELECT * "
                + " FROM tbl_cliente "
                + "WHERE cli_nome LIKE ?";

        try {
            pst = conn.prepareStatement(sql);

            pst.setString(1, cli_nome);
            rs = pst.executeQuery();

            while (rs.next()) {
                ClienteDTO obj = new ClienteDTO();

                obj.setIdCliente(rs.getInt("id_cliente"));
                obj.setNomeCliente(rs.getString("cli_nome"));
                obj.setCpfCliente(rs.getString("cli_cpf"));
                obj.setNascCliente(rs.getString("cli_nasc"));
                obj.setCelularCliente(rs.getString("cli_celular"));
                obj.setCepCliente(rs.getString("cli_cep"));
                obj.setRuaCliente(rs.getString("cli_rua"));
                obj.setNumeroCliente(rs.getInt("cli_numero"));
                obj.setBairroCliente(rs.getString("cli_bairro"));
                obj.setCidadeCliente(rs.getString("cli_cidade"));
                obj.setEstadoCliente(rs.getString("cli_estado"));
                obj.setDebitoCliente(rs.getDouble("cli_debito"));

                lista.add(obj);

            }
            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente não selecionado para busca " + erro);
            return null;
        }

    }

//Metodo pesquisa o nome dos Clientes cadastrado no banco
    public ClienteDTO pesquisarCPFCliente(String cli_cpf) {
        String sql = "SELECT * "
                + "FROM tbl_cliente "
                + "WHERE cli_cpf = ? ";

        try {

            pst = conn.prepareStatement(sql);

            pst.setString(1, cli_cpf);
            rs = pst.executeQuery();
            ClienteDTO obj = new ClienteDTO();

            if (rs.next()) {

                obj.setIdCliente(rs.getInt("id_cliente"));
                obj.setNomeCliente(rs.getString("cli_nome"));
                obj.setCpfCliente(rs.getString("cli_cpf"));
                obj.setNascCliente(rs.getString("cli_nasc"));
                obj.setCelularCliente(rs.getString("cli_celular"));
                obj.setCepCliente(rs.getString("cli_cep"));
                obj.setRuaCliente(rs.getString("cli_rua"));
                obj.setNumeroCliente(rs.getInt("cli_numero"));
                obj.setBairroCliente(rs.getString("cli_bairro"));
                obj.setCidadeCliente(rs.getString("cli_cidade"));
                obj.setEstadoCliente(rs.getString("cli_estado"));
                obj.setDebitoCliente(rs.getDouble("cli_debito"));

            }
            return obj;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Cliente não selecionado para busca " + erro);
            return null;
        }
        // Esse metodo retorna o usuario cadastrado

    }

    public ResultSet CBXlistarNomeCliente() // lista o nome do cliente  para jogar na combobox
    {
        String sql = "SELECT * "
                + "FROM tbl_cliente "
                + "ORDER BY cli_nome ";
        try {
            pst = conn.prepareStatement(sql);

            return pst.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " ListarNomeClienteDAO" + erro);
            return null;
        }

    }

}
