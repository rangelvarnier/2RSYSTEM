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
    private Connection con;
    
    public Connection conexaoUtil() {
        String endereco = "JDBC:mysql://localhost/2RSYSTEMRestaurante?autoReconnect=true";
        String user = "root";
        String password = "";
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
    
    public Connection criarConexao(){
        return con;
    }
}
