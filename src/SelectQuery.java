import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

    public void selectQueryTest() {
        try (Connection conn = TryConections.getConnection()) {
            if (conn == null) {
                System.out.println("Select no connection");
                return;
            }

            String query = "SELECT * FROM car";
            try (Statement statement = conn.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    int carID = resultSet.getInt("carID");
                    System.out.println("carID: " + carID);
                }
                conn.close();
                System.out.println("closing connection");

            } catch (SQLException e) {
                System.out.println("Selecting error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}
