


package UTILIDADES;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LimparCampos 
        
{
    /**
     * Metodo para limpar todo o JPainel de uma só vez
     * @param container 
     */

    public void Limpar(JPanel container)
    {
        Component components[] = container.getComponents();
        
        for(Component component : components)
        {
            if(component instanceof JTextField)
            {
                ((JTextField)component).setText(null);
            }
        }
    }
}
