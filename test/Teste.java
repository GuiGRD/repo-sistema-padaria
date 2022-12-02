
import VIEW.Venda;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class Teste {
  private Venda obj = new Venda();
  
  
  @Test
  public void testeQnt(){
      assertEquals(4, obj.Quantidade(2,2));
      

  }
  
}

