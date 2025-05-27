import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter number of students: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // discard invalid input
                System.out.print("Enter number of students: ");
            }
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            for (int i = 0; i < n; i++) {
                System.out.print("Enter student ID: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter a valid ID number!");
                    scanner.next(); // discard invalid input
                    System.out.print("Enter student ID: ");
                }
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline
                
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                
                studentMap.put(id, name);
            }
            
            System.out.print("\nEnter ID to search: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid ID number!");
                scanner.next(); // discard invalid input
                System.out.print("Enter ID to search: ");
            }
            int searchId = scanner.nextInt();
            String studentName = studentMap.get(searchId);
            
            if (studentName != null) {
                System.out.println("Student name: " + studentName);
            } else {
                System.out.println("Student not found");
            }
        } finally {
            scanner.close();
        }
    }
}