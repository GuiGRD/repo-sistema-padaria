import VIEW.VendaTest;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author Pri
 */
public class TesteVenda {

    @Test
    public void TestQnt() {
        int qnt, preco;
        qnt = 2;
        preco = 2;
        VendaTest v = new VendaTest();
        assertEquals(4, v.testQuantidade(qnt,preco));
    }

}
