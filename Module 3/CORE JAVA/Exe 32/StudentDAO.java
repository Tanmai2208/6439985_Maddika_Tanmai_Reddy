import java.sql.*;
import java.util.Scanner;

public class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static void insertStudent(String name, int age) throws SQLException {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Student added successfully");
        }
    }
    
    public static void updateStudent(int id, String name, int age) throws SQLException {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Add student");
        System.out.println("2. Update student");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        try {
            if (option == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student age: ");
                int age = scanner.nextInt();
                insertStudent(name, age);
            } else if (option == 2) {
                System.out.print("Enter student ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new age: ");
                int age = scanner.nextInt();
                updateStudent(id, name, age);
            }
        } catch (SQLException e) {
            System.out.println("Database error");
            e.printStackTrace();
        }
    }
}