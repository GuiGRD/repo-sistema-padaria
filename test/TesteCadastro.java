
import DAO.FornecedorDAOTest;
import DTO.FornecedorDTO;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Pri
 */
public class TesteCadastro {

    int erro;

    @Test
    public void TesteCadastroFornecedor() {
        //Passa as informações para cadastro do teste
        
        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("ELMA CHIPS");
        obj.setCnpjFornecedor("99.111.201/0001-12");
        obj.setCelularFornecedor("(12)98765-1234");
        obj.setCepFornecedor("12340-000");
        obj.setRuaFornecedor("RUA1");
        obj.setNumeroFornecedor(Integer.parseInt("1"));
        obj.setBairroFornecedor("BAIRRO1");
        obj.setCidadeFornecedor("CIDADE1");
        obj.setEstadoFornecedor("SP");
        obj.setIdFornecedor(Integer.parseInt("28"));


        if (obj.getNomeFornecedor().isEmpty()
                || obj.getCnpjFornecedor().equals("  .   .   /    -  ")
                || obj.getCelularFornecedor().equals("(  )        -     ")) 
        {
            erro = 1;

        } else {
            FornecedorDAOTest testobjdao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(true, testobjdao.testCadastrarFornecedor(obj));

        }
        assertEquals(0, erro);
    }
       @Test
    public void TesteDuplicidadeCadastroFornecedor() {
        //Passa as informações para cadastro do teste
        
        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("ELMA CHIPS");
        obj.setCnpjFornecedor("99.111.201/0001-12");
        obj.setCelularFornecedor("(12)98765-1234");
        obj.setCepFornecedor("12340-000");
        obj.setRuaFornecedor("RUA1");
        obj.setNumeroFornecedor(Integer.parseInt("1"));
        obj.setBairroFornecedor("BAIRRO1");
        obj.setCidadeFornecedor("CIDADE1");
        obj.setEstadoFornecedor("SP");
        obj.setIdFornecedor(Integer.parseInt("28"));


        if (obj.getNomeFornecedor().isEmpty()
                || obj.getCnpjFornecedor().equals("  .   .   /    -  ")
                || obj.getCelularFornecedor().equals("(  )        -     ")) 
        {
            erro = 1;

        } else {
            FornecedorDAOTest testobjdao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(false, testobjdao.testCadastrarFornecedor(obj));

        }
        assertEquals(0, erro);
    }
    
}
