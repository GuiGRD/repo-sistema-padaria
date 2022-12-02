package DAO;

import CONEXAO.Conexao;
import DTO.FornecedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FornecedorDAO {
//Metodo para Cadastrar,Alterar,Excluir,Consultar (para consultar é preciso listar
// as informacoes dos fornecedores armazenadas no banco de dados e mostrar em uma tabela para o usuario)
    
    Connection conn = new Conexao().conectaBD(); //Connection conn ; // Faz a conexao com o banco de dados
    PreparedStatement pst; // preparando a conexao, cria um obj para representar as instrucoes do SQL que será executada
    ResultSet rs; // resultado em forma de tabela no banco da consulta no banco de dados 
    ArrayList<FornecedorDTO> lista = new ArrayList<>();

    public void cadastrarFornecedor(FornecedorDTO objforndto) 
     //Criar o comando SQL para pegar(.get)os valores no campo do usuario e setar(.set) esses valores dentro dos campos no banco de dados
            
    {
        String sql = "INSERT INTO tbl_fornecedor("
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
        
        ///conn = new Conexao().conectaBD();

        try {
            
            pst = conn.prepareStatement(sql);//conecta e prepara organizando o comando SQL
            
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

    public void editarFornecedor(FornecedorDTO objforndto) 
    {
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
        
        ///conn = new Conexao().conectaBD();

        try {
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
        
        } catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao alterar fornecedor " + erro);
        }
    }

    public void excluirFornecedor(FornecedorDTO objforndto) 
    {
        String sql = "DELETE FROM tbl_fornecedor WHERE id_fornecedor = ? ";
        
        //conn = new Conexao().conectaBD();

        try 
        {
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, objforndto.getIdFornecedor());

            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso");

        } catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Funcionario nao alterado, erro", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<FornecedorDTO> listarFornecedor() //lista fornecedor e  para jogar em uma tabela
    {
        String sql = "SELECT * FROM tbl_fornecedor ";
        
        ///conn = new Conexao().conectaBD();

        try 
        {
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) 
            {
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
            
        } catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao listar o FornecedorDAO " + erro);
            return null;
        }
        
    }

    public ArrayList<FornecedorDTO> buscarFornecedor(String forn_nome) 
    {
        String sql = "SELECT * FROM tbl_fornecedor WHERE forn_nome LIKE ? ";
        
        
        try 
        {
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, forn_nome);
            rs = pst.executeQuery();

            while (rs.next()) 
            {
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
            
        } catch (SQLException erro) 
        {
            JOptionPane.showMessageDialog(null, "Fornecedor não selecionado para busca " + erro);
            return null;
        }
        
    }
    
    public ResultSet CBXlistarNomeFornecedor() // lista o nome do fornecedor  para jogar na combobox
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

