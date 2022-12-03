
import DAO.FornecedorDAOTest;
import DAO.ProdutoDAO;
import DAO.ProdutoDAOTest;
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;
import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Pri
 */
public class TesteCadastrar {

    int erro;

    @Test
    public void TesteCadastroFornecedor() {
        //Passa as informações para cadastro do teste

        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("CATUPIRY");
        obj.setCnpjFornecedor("99.266.601/0001-12");
        obj.setCelularFornecedor("(12)98765-1234");
        obj.setCepFornecedor("12340-000");
        obj.setRuaFornecedor("RUA1");
        obj.setNumeroFornecedor(Integer.parseInt("1"));
        obj.setBairroFornecedor("BAIRRO1");
        obj.setCidadeFornecedor("CIDADE1");
        obj.setEstadoFornecedor("SP");
        obj.setIdFornecedor(Integer.parseInt("72"));

        if (obj.getNomeFornecedor().isEmpty()
                || obj.getCnpjFornecedor().equals("  .   .   /    -  ")
                || obj.getCelularFornecedor().equals("(  )        -     ")) {
            erro = 1;

        } else {
            FornecedorDAOTest testedao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(true, testedao.CadastrarFornecedor(obj));

        }
        assertEquals(0, erro);
    }

    @Test
    public void TesteCadastroFornecedorDuplicidade() {
        //Passa as informações para cadastro do teste

        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("ELMA CHIPS");
        obj.setCnpjFornecedor("99.111.401/0001-12");
        obj.setCelularFornecedor("(12)98765-1234");
        obj.setCepFornecedor("12340-000");
        obj.setRuaFornecedor("RUA1");
        obj.setNumeroFornecedor(Integer.parseInt("1"));
        obj.setBairroFornecedor("BAIRRO1");
        obj.setCidadeFornecedor("CIDADE1");
        obj.setEstadoFornecedor("SP");
        obj.setIdFornecedor(Integer.parseInt("36"));

        if (obj.getNomeFornecedor().isEmpty()
                || obj.getCnpjFornecedor().equals("  .   .   /    -  ")
                || obj.getCelularFornecedor().equals("(  )        -     ")) {
            erro = 1;

        } else {
            FornecedorDAOTest testedao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(false, testedao.CadastrarFornecedor(obj));

        }
        assertEquals(0, erro);
    }

    @Test
    public void TesteCadastroFornecedorDadosIncompletos() {
        //Passa as informações para cadastro do teste

        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("ELMA CHIPS");
        obj.setCnpjFornecedor("");
        obj.setCelularFornecedor("(12)98765-1234");
        obj.setCepFornecedor("12340-000");
        obj.setRuaFornecedor("RUA1");
        obj.setNumeroFornecedor(Integer.parseInt("1"));
        obj.setBairroFornecedor("BAIRRO1");
        obj.setCidadeFornecedor("CIDADE1");
        obj.setEstadoFornecedor("SP");
        obj.setIdFornecedor(Integer.parseInt("37"));

        if (obj.getNomeFornecedor().isEmpty()
                || obj.getCnpjFornecedor().isEmpty()
                || obj.getCelularFornecedor().isEmpty()) {
            erro = 1;

        } else {
            FornecedorDAOTest testedao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(false, testedao.CadastrarFornecedor(obj));

        }
        assertEquals(1, erro);
    }

    /**
     * Test Cadastro de Produto
     */
    
    public void TesteCadastrarProduto() 
    {
        
        ProdutoDTO objpd = new ProdutoDTO();
        objpd.setCodbarraProduto(Integer.parseInt("90"));
        objpd.setNomeProduto("Queijo");

        ProdutoDAO objdao = new ProdutoDAO();
        objdao.cadastrarProduto(objpd);
        
        if (
            objpd.getCodbarraProduto().isEmpty||
            objpd.getNomeProduto().isEmpty())
        {
            
            erro = 1;
        } else {
            ProdutoDAOTest testedao = new ProdutoDAOTest();
            erro = 0;
        }
        assertEquals(0, erro);

        }
        
        
        
    /**
     * Test Cadastro de usuario
     */
    public void TesteCadastrarUsuário() {
    }



    

    public void TesteCadastrarFuncionario() {
    }

}
