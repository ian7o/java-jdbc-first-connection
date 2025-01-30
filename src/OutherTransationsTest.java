import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OutherTransationsTest {

    public void transTest() throws SQLException {
        TryConections tryConections = new TryConections();
        Connection conn = null;
        Statement statement = null;
        try {
            conn = tryConections.getConnection();
            statement = conn.createStatement();
            conn.setAutoCommit(false);
            String isrt = "insert INTO car(carID) values (104)";
            String updt1 = "update car set color = 'clrtest3' where carid=103";
            String updt2 = "update car set brand = 'brndTest3' where carid=103";
            statement.executeUpdate(isrt);
            statement.executeUpdate(updt1);
            statement.executeUpdate(updt2);
            conn.commit();
            System.out.println("transations successful");
        } catch (Exception e) {
            if (conn != null) {
                conn.rollback();
                System.out.println("rollbackk");
                System.out.println("transations failed because: " + e.getMessage());
            }
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection closed");
                } catch (Exception e) {
                    System.out.println("close conn error: " + e.getMessage());
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                    System.out.println("statement closed");
                } catch (Exception e) {
                    System.out.println("close statement error: " + e.getMessage());
                }
            }
        }
    }
}
