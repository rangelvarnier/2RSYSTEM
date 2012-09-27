
package RESTAURANTE.DAO.UTIL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
     private static Connection con;

    static{
        String url = "jdbc:mysql://localhost/2rsitem?"
                + "autoReconnect=true";
        String user = "root";
        String password = "";

        try {
            con = DriverManager.getConnection(url, user,
                    password);
        } catch (SQLException ex) {
            System.out.println("Erro de conexão");
            ex.printStackTrace();
        }
    }

    public Connection criarConexao(){
        return con;
    
    }
}
