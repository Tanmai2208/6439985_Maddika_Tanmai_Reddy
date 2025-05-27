import java.util.Scanner;

public class TypeCastingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        double doubleValue = scanner.nextDouble();
        
        // Cast to int
        int intValue = (int) doubleValue;
        System.out.println("double to int: " + intValue);
        
        System.out.print("\nEnter an integer: ");
        int anotherInt = scanner.nextInt();
        
        // Cast to double
        double anotherDouble = anotherInt;
        System.out.println("int to double: " + anotherDouble);
        
        scanner.close();
    }
}