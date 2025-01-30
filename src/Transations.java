import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transations {

    public void transations() throws SQLException {
        TryConections tryConections = new TryConections();
        Connection conn = tryConections.getConnection();
        try (conn;
             Statement statement = conn.createStatement())
        {
            conn.setAutoCommit(false);
            String set1 = "update car set color = 'clrtest' where carid=101";
            String set2 = "update car set brand = 'brndTest' where carid=101";
            statement.executeUpdate(set1);
            statement.executeUpdate(set2);
            conn.commit();
            System.out.println("transations accept");
        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
                System.out.println("rollbackk");
                System.out.println("transations failed because: " + e.getMessage());
            }
        }
    }
}