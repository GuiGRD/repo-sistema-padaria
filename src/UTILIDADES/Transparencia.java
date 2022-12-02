
package UTILIDADES;

import java.awt.Color;
import javax.swing.JFrame;

public class Transparencia 
        
{
    /**
     * Método para tirar as bordas do JFrame
     * @param tela 
     */
    
    public void aplicarTransparencia(JFrame tela)
    {
        //tira as bordas do Frame/Tela
        tela.setUndecorated(true);
        
        
        // Aplica a opacidade do Frame/Tela e seus componentes
        //tela.setOpacity(0.5f); 
        
        
        //Aplica a cor do Frame/Tela
        tela.setBackground(new Color(0,0,0,0));//dentro do color (1 = vermelho, 2 = verde, 3 = azul, 4 = cor alfa que vai aplicar a transparencia)
    }
    
}
