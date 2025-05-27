import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        
        System.out.print("Enter a boolean (true/false): ");
        boolean boolValue = scanner.nextBoolean();
        
        System.out.println("\nValues entered:");
        System.out.println("int: " + intValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + boolValue);
        
        scanner.close();
    }
}