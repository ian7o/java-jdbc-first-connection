import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {

    public void selectQueryTest() {
        TryConections tryConections = new TryConections();
        try (Connection conn = tryConections.getConnection();
             //fechando os dois direto
             Statement statement = conn.createStatement()) {

                String query = "SELECT * FROM car";
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int carID = resultSet.getInt("carID");
                    String brand = resultSet.getString("brand"), model = resultSet.getString("model"), color = resultSet.getString("color"), priceForHour, manufactureYear, plate;
                    System.out.println("carID: " + carID + " brand: " + brand + "model: " + model + " color: " + color);
                }

        } catch (Exception e) {
            System.out.println("selection error: " + e.getMessage());
        }
    }

//    //ta aqui para eu usar separado depois se precisar mas nesse caso o proprio try ja fecha então nao preciso é para o futuro
//    public Connection closeConn(Connection especify) {
//        try {
//            especify.close();
//
//        } catch (SQLException e) {
//            System.out.println("close error: " + e.getMessage());
//        }
//        return especify;
//    }
}
