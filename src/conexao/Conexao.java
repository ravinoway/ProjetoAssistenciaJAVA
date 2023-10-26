package conexao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * conexao
 */
public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/testebd";
    private static final String user = "root";
    private static final String password = "4776";

    private static Connection conn;

    /**
     * @return
     */
    public static Connection getConexao(){

        try {
            if(conn == null) {
               conn = DriverManager.getConnection(url, user, password);
               return conn;
            }else{
                return conn;
            }
        } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }

        
    }
}