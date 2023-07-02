import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PostgreSQL {
    public void saveToDatabase(double totalPrice, List<MenuItem> userBasket){
        String url = "jbdc:postgresql://localhost:5432/";
        String user = " ";
        String password =" ";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
        String query = "INSERT INTO tabela (cena, koszyk) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setDouble(1, totalPrice);
        stmt.setString(2, getUserBasketAsString(userBasket));
        stmt.executeUpdate();
        System.out.println("Dane zapisane w bazie danych.");
    } catch (SQLException e) {
        System.out.println("Wystąpił błąd podczas zapisu do bazy danych: " + e.getMessage());
    }
}

    private String getUserBasketAsString(List<MenuItem> userBasket) {
        StringBuilder sb = new StringBuilder();
        for (MenuItem item : userBasket) {
            sb.append(item.getName()).append(", ");
        }
        return sb.toString();
    }
}



