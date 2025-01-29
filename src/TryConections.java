import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryConections {

    public Connection getConnection() {
        String dbURL = "jdbc:mysql://localhost:3306/rentACarDB";
        String username = "root";
        String password = "";

            Connection theConnection = null;

        try {
            theConnection = DriverManager.getConnection(dbURL, username, password);
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        }

            return theConnection;
    }
}
