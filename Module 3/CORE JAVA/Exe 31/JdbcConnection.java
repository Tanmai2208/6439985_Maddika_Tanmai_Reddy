import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "password";
        
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to database");
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + 
                                 ", Name: " + rs.getString("name") +
                                 ", Age: " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}