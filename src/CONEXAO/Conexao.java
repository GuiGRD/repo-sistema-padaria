package CONEXAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * 
 * @author Pri
 */

public class Conexao {
    /**
     *
     * Método Conecta: Vai criar a conexão para poder ter acesso ao banco de dados.
     *
     * @return Com sucesso retorna a conexão.
     */
    Connection conn = null;

    public Connection conectaBD() {

        try {
            String url = "jdbc:mysql://localhost:3306/bancopadaria?user=root&password=";
            conn = DriverManager.getConnection(url);

        } //Qualquer tipo de erro ele entra no catch.. ele tenta senao ele gera a excessao
        catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "erro na Conexao" + erro.getMessage());

        }
        return conn;

    }
}
