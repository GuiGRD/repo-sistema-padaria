
package CONEXAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Conexao
{
    //Criando a conexao com o banco de dados 

    public Connection conectaBD()
    {
        Connection conn = null;
        try
        {
            String url = "jdbc:mysql://localhost:3306/bancopadaria?user=root&password=" ;
            conn = DriverManager.getConnection(url);
        } 
        //Qualquer tipo de erro ele entra no catch.. ele tenta senao ele gera a excessao
        catch(SQLException erro)
        {
           
            JOptionPane.showMessageDialog(null, "erro na Conexao"+erro.getMessage());
            
        }
        return conn;
            
        }
}

