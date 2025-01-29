import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryConections {

    public static Connection getConnection() {
        String dbURL = "jdbc:mysql://127.0.0.1:3306/rentACarDB";
        String username = "root";
        String password = "dsds";

        Connection theConnection = null;

        try {
            theConnection = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }

        return theConnection;
    }
}
