import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

public class SelectQuery {

    public List<Car> selectQueryTest() {
        TryConections tryConections = new TryConections();
        List<Car> carArrayList = new ArrayList<>();
        try (Connection conn = tryConections.getConnection();
             //fechando os dois direto
             Statement statement = conn.createStatement())
        {
            String query = "SELECT * FROM car";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int carID = resultSet.getInt("carID");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                String color = resultSet.getString("color");
                int priceForHour = resultSet.getInt("priceForHour");
                int manufactureYear = resultSet.getInt("manufactureYear");
                int plate = resultSet.getInt("plate");

                carArrayList.add(new Car(carID,
                        brand,
                        model,
                        color,
                        priceForHour,
                        manufactureYear,
                        plate));
            }
            carArrayList.forEach(i -> System.out.println(i));

        } catch (SQLException e) {
            System.out.println("selection error: " + e.getMessage());
        }
        return carArrayList;
    }
}
