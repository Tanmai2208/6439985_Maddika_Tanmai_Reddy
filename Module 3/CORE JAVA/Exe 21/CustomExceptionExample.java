import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
        System.out.println("Valid age: " + age);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            validateAge(age);
            
            System.out.println("You are eligible to proceed.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}