/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import DTO.FuncionarioDTO;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pri
 */
public class FuncionarioDAOTest {
    
    public FuncionarioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testCadastrarFuncionario() {
        System.out.println("cadastrarFuncionario");
        FuncionarioDTO obj = null;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.cadastrarFuncionario(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editarFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testEditarFuncionario() {
        System.out.println("editarFuncionario");
        FuncionarioDTO obj = null;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.editarFuncionario(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testExcluirFuncionario() {
        System.out.println("excluirFuncionario");
        FuncionarioDTO obj = null;
        FuncionarioDAO instance = new FuncionarioDAO();
        instance.excluirFuncionario(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testListarFuncionario() {
        System.out.println("listarFuncionario");
        FuncionarioDAO instance = new FuncionarioDAO();
        ArrayList<FuncionarioDTO> expResult = null;
        ArrayList<FuncionarioDTO> result = instance.listarFuncionario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarFuncionario method, of class FuncionarioDAO.
     */
    @Test
    public void testBuscarFuncionario() {
        System.out.println("buscarFuncionario");
        String fun_nome = "";
        FuncionarioDAO instance = new FuncionarioDAO();
        ArrayList<FuncionarioDTO> expResult = null;
        ArrayList<FuncionarioDTO> result = instance.buscarFuncionario(fun_nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
