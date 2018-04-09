/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foconafoto.dao;

/**
 *
 * @author bruno
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruno
 */
public class Conexao {

    private static final String endereco = "jdbc:mysql://localhost/foconafoto";
    private static final String usuario = "root";
    private static final String senha = "nuno1992";
    private static final String driver = "com.mysql.jdbc.Driver";

    public static Connection conecta() throws ClassNotFoundException {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(endereco, usuario, senha);
            System.out.println("Conectou!");
        } catch (SQLException e) {
        } catch (ClassNotFoundException e) {
            throw e;
        }
        return connection;
    }

    public static void desconectar(Connection connection) {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
            System.out.println("Desconectou!");
        } catch (SQLException e) {
        }
    }
    
}

