
import DAO.FornecedorDAOTest;
import DAO.FuncionarioDAOTest;
import DAO.ProdutoDAOTest;
import DAO.UsuarioDAOTest;
import DTO.FornecedorDTO;
import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Pri
 */
public class TesteConsultar {

    /**
     * Teste Método Buscar Fornecedor
     */
    @Test
    public void ConsultarFornecedorPorNome() {
        String nome = "%" + "COCA" + "%";

        FornecedorDAOTest dao = new FornecedorDAOTest();
        ArrayList<FornecedorDTO> listatest = dao.BuscarFornecedor(nome);
        assertNotEquals("[]", listatest);
    }

    @Test
    public void ConsultarFornecedorPorNomeVazio() {
        String nome = "%" + "" + "%";

        FornecedorDAOTest dao = new FornecedorDAOTest();
        ArrayList<FornecedorDTO> listatest = dao.BuscarFornecedor(nome);
        assertNotNull(listatest.toString());
    }

    @Test
    public void ConsultarFornecedorPorNomeSemCadastro() {
        String nome = "%" + "" + "%";

        FornecedorDAOTest dao = new FornecedorDAOTest();
        ArrayList<FornecedorDTO> listatest = dao.BuscarFornecedor(nome);
        assertNotNull(listatest.toString());
    }

    /**
     * Teste Método Buscar Funcionario
     */
    @Test
    public void ConsultarFuncionarioPorNome() {
        String nome = "%" + "FLAVIO" + "%";

        FuncionarioDAOTest dao = new FuncionarioDAOTest();
        ArrayList<FuncionarioDTO> listatest = dao.buscarFuncionario(nome);
        assertNotEquals("[]", listatest);
    }

    @Test
    public void ConsultarFuncionarioPorNomeVazio() {
        String nome = "%" + "" + "%";

        FuncionarioDAOTest dao = new FuncionarioDAOTest();
        ArrayList<FuncionarioDTO> listatest = dao.buscarFuncionario(nome);
        assertNotNull(listatest.toString());
    }

    @Test
    public void ConsultarFuncionarioPorNomeSemCadastro() {
        String nome = "%" + "" + "%";

        FuncionarioDAOTest dao = new FuncionarioDAOTest();
        ArrayList<FuncionarioDTO> listatest = dao.buscarFuncionario(nome);
        assertNotNull(listatest.toString());
    }

    /**
     * Teste Método Buscar Produto
     */
    @Test
    public void ConsultarProdutoPorNome() {
        String nome = "%" + "CAFE" + "%";

        ProdutoDAOTest dao = new ProdutoDAOTest();
        ArrayList<ProdutoDTO> listatest = dao.buscarNomeProduto(nome);
        assertNotEquals("[]", listatest);
    }

    @Test
    public void ConsultarProdutoPorNomeVazio() {
        String nome = "%" + "" + "%";

        ProdutoDAOTest dao = new ProdutoDAOTest();
        ArrayList<ProdutoDTO> listatest = dao.buscarNomeProduto(nome);
        assertNotNull(listatest.toString());
    }

    @Test
    public void ConsultarProdutoPorNomeSemCadastro() {
        String nome = "%" + "" + "%";

        ProdutoDAOTest dao = new ProdutoDAOTest();
        ArrayList<ProdutoDTO> listatest = dao.buscarNomeProduto(nome);
        assertNotNull(listatest.toString());
    }

    @Test
    public void ConsultarProdutoPorCodigo() {
        ProdutoDTO obj = new ProdutoDTO();
        ProdutoDAOTest dao = new ProdutoDAOTest();

        int cod = Integer.parseInt("2");
        obj = dao.buscarCodigoProduto(cod);
        assertNotEquals("[]", obj);
    }
    
    /**
     * Método Buscar Usuario
     */
        
    
        @Test
    public void ConsultarUsuarioPorNome() {
        String nome = "%" + "Flavio" + "%";

        UsuarioDAOTest dao = new UsuarioDAOTest();
        ArrayList<UsuarioDTO> listatest = dao.buscarUsuario(nome);
        assertNotEquals("[]", listatest);
    }

    @Test
    public void ConsultarUsuarioPorNomeVazio() {
        String nome = "%" + "" + "%";

        UsuarioDAOTest dao = new UsuarioDAOTest();
        ArrayList<UsuarioDTO> listatest = dao.buscarUsuario(nome);
        assertNotNull(listatest.toString());
    }
    
    
        @Test
    public void ConsultarUsuarioPorNomeSemCadastro() {
        String nome = "%" + "" + "%";

        UsuarioDAOTest dao = new UsuarioDAOTest();
        ArrayList<UsuarioDTO> listatest = dao.buscarUsuario(nome);
        assertNotNull(listatest.toString());
    }

}
