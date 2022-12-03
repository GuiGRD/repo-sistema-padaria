
import DAO.FornecedorDAOTest;
import DAO.FuncionarioDAOTest;
import DAO.ProdutoDAOTest;
import DAO.UsuarioDAOTest;
import DTO.FornecedorDTO;
import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import DTO.UsuarioDTO;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Pri
 */
public class TesteExcluir {

    @Test
    public void TesteExcluirFornecedor() {
        FornecedorDTO obj = new FornecedorDTO();
        obj.setIdFornecedor(Integer.parseInt("61"));

        FornecedorDAOTest teste = new FornecedorDAOTest();
        assertEquals(true, teste.ExcluirFornecedor(obj));
    }

    @Test

    public void TesteExcluirProduto() {
        ProdutoDTO obj = new ProdutoDTO();
        obj.setIdProduto(Integer.parseInt("57"));

        ProdutoDAOTest teste = new ProdutoDAOTest();
        assertEquals(true, teste.excluirProduto(obj));

    }
    
        @Test

    public void TesteExcluirProdutoEstoque() {
        ProdutoDTO obj = new ProdutoDTO();
        obj.setIdProduto(Integer.parseInt("87"));

        ProdutoDAOTest teste = new ProdutoDAOTest();
        assertEquals(false, teste.excluirProduto(obj));

    }
    
    
    
        @Test
    public void TesteExcluirUsuario() {
        UsuarioDTO obj = new UsuarioDTO();
        obj.setIdUsuario(Integer.parseInt("7"));

        UsuarioDAOTest teste = new UsuarioDAOTest();
        assertEquals(true, teste.excluirUsuario(obj));

    }
   
    @Test
    public void TesteExcluirFuncionario() {
        FuncionarioDTO obj = new FuncionarioDTO();
        obj.setIdFuncionario(Integer.parseInt("2"));

        FuncionarioDAOTest teste = new FuncionarioDAOTest();
        assertEquals(true, teste.excluirFuncionario(obj));
    }

    
}
