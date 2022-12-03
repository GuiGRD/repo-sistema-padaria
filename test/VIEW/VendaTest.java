/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package VIEW;

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
public class VendaTest {

    public VendaTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    Venda v;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Quantidade method, of class Venda.
     */
    @Test
    public int testQuantidade(int qnt, int preco) {
        //System.out.println("Quantidade");
        Venda instance = new Venda();
        instance.Quantidade();
        // TODO review the generated test code and remove the default call to fail.
        
        int quantidade = 0;
        return quantidade;

    }

    /**
     * Test of Balanco method, of class Venda.
     */
    @Test
    public void testBalanco() {
        System.out.println("Balanco");
        Venda instance = new Venda();
        instance.Balanco();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Print method, of class Venda.
     */
    @Test
    public void testPrint() {
        System.out.println("Print");
        Venda instance = new Venda();
        instance.Print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
