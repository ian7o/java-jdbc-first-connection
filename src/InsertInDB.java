import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInDB {
    public void newInsertion() {
        TryConections tryConections = new TryConections();
        try (Connection conn = tryConections.getConnection();
             Statement statement = conn.createStatement()) {

                System.out.println("insert");
                String isrt1 = "insert INTO car(carID,brand,model) values (101,'insertion', 'test')";
                statement.executeUpdate(isrt1);

        } catch (SQLException e) {
            System.out.println("insert error:" + e.getMessage());
        }
    }
}
