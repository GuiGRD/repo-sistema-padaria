package DAO;

import CONEXAO.Conexao;
import DTO.CompraDTO;
import DTO.CompraItensDTO;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import VIEW.Venda;
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
 * @author Pri Bucholz
 */
public class CompraItensDAO {

    //Cria a Conexão
    Connection conn = new Conexao().conectaBD();
    // Prepara a Conexão
    PreparedStatement pst;
     //Retorna todo o resultado encontrado percorrendo cada linha do banco de dados
    ResultSet rs;
    //Cria uma Lista das informações no banco de dados
    ArrayList<CompraItensDTO> lista = new ArrayList<>();

    
    
     /**
     * Método Compra serão utilizados os atributos que foram encapsulados em
     * getters e setters no DTO para: Cadastrar, Editar, Excluir e Consultar as
     * informações no banco de dados na tabela compra.
     */
    public void cadastrarCompra(CompraItensDTO obj)
    
    {
        //Através dos comandos SQL salva as informações nas colunas da tabela compra no banco de dados.
        String sql = ""
                + "INSERT INTO tbl_compra_itens( "
                + "fk_compra, "
                + "fk_produto, "
                + "compra_qnt, "
                + "compra_preco, " 
                + "compra_subtotal) "
                + "VALUES (?,?,?,?,?)";

        try {
            //Preparar e Conecta o BD e organiza o comando SQL
            pst = conn.prepareStatement(sql);


            pst.setInt(1, obj.getCompra().getIdCompra());
            pst.setInt(2, obj.getProduto().getIdProduto());
            pst.setInt(3, obj.getCompraQnt());
            pst.setInt(4, obj.getCompraPreco());
            pst.setInt(5, obj.getCompraSubtotal());

            
            //Executar o comando SQL
            pst.execute();
            pst.close();

            JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar a compra " + erro);
        }
    }


}
