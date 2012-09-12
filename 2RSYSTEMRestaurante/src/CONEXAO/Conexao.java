/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rangel
 */
public class Conexao {
    
    public Connection conexaoUtil() {
        String endereco = "JDBC:mysql://localhost/2RSYSTEMRestaurante?autoReconnect=true";
        String user = "root";
        String password = "483729";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(endereco,
                    user, password);
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com Banco de Dados"
                    + ex.getMessage());
        }
        return connection;
    }
    
}
