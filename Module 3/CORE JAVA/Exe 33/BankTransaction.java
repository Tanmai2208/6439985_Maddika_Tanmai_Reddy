import java.sql.*;
import java.util.Scanner;

public class BankTransaction {
    private static final String URL = "jdbc:mysql://localhost:3306/bankdb";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static void transfer(int fromAccount, int toAccount, double amount) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            conn.setAutoCommit(false); // Start transaction
            
            // Check if fromAccount has sufficient balance
            PreparedStatement checkBalance = conn.prepareStatement(
                "SELECT balance FROM accounts WHERE account_id = ?");
            checkBalance.setInt(1, fromAccount);
            ResultSet rs = checkBalance.executeQuery();
            
            if (!rs.next()) {
                System.out.println("From account not found");
                return;
            }
            
            double currentBalance = rs.getDouble("balance");
            if (currentBalance < amount) {
                System.out.println("Insufficient funds");
                return;
            }
            
            // Debit fromAccount
            PreparedStatement debit = conn.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
            debit.setDouble(1, amount);
            debit.setInt(2, fromAccount);
            debit.executeUpdate();
            
            // Credit toAccount
            PreparedStatement credit = conn.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
            credit.setDouble(1, amount);
            credit.setInt(2, toAccount);
            int rowsUpdated = credit.executeUpdate();
            
            if (rowsUpdated == 0) {
                System.out.println("To account not found - rolling back");
                conn.rollback();
                return;
            }
            
            conn.commit();
            System.out.println("Transfer successful");
        } catch (SQLException e) {
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("Transfer failed");
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.setAutoCommit(true);
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter source account ID: ");
        int from = scanner.nextInt();
        
        System.out.print("Enter destination account ID: ");
        int to = scanner.nextInt();
        
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        
        transfer(from, to, amount);
    }
}