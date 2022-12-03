
import DAO.FornecedorDAOTest;
import DTO.FornecedorDTO;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Pri
 */
public class TesteEditar {
    int erro;
    
    @Test
    public void TesteEditarFornecedor() {
        //Passa as informações para cadastro do teste

       
        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("CATUPIRY LTDA");
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
                || obj.getCnpjFornecedor().isEmpty()
                || obj.getCelularFornecedor().isEmpty()) {
            erro = 1;

        } else {
            FornecedorDAOTest testobjdao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(true, testobjdao.EditarFornecedor(obj));

        }
        assertEquals(0, erro);
    }
    
          @Test
    public void TesteEditarFornecedorDadosIncompletos() {
        //Passa as informações para cadastro do teste

      
        FornecedorDTO obj = new FornecedorDTO();
        obj.setNomeFornecedor("CATUPIRY LTDA");
        obj.setCnpjFornecedor("");
        obj.setCelularFornecedor("(12)98765-1234");
        obj.setCepFornecedor("12340-000");
        obj.setRuaFornecedor("RUA1");
        obj.setNumeroFornecedor(Integer.parseInt("1"));
        obj.setBairroFornecedor("BAIRRO1");
        obj.setCidadeFornecedor("CIDADE1");
        obj.setEstadoFornecedor("SP");
        obj.setIdFornecedor(Integer.parseInt("72"));

        if (obj.getNomeFornecedor().isEmpty()
                || obj.getCnpjFornecedor().isEmpty()
                || obj.getCelularFornecedor().isEmpty()) {
            erro = 1;

        } else {
            FornecedorDAOTest testobjdao = new FornecedorDAOTest();
            erro = 0;
            assertEquals(true, testobjdao.EditarFornecedor(obj));

        }
        assertEquals(1, erro);
    }
    
}
