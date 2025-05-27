import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        
        int result1 = a + b * c;  // Multiplication first
        int result2 = (a + b) * c; // Parentheses first
        
        System.out.println("\n" + a + " + " + b + " * " + c + " = " + result1);
        System.out.println("(" + a + " + " + b + ") * " + c + " = " + result2);
        
        System.out.println("\nOperator Precedence:");
        System.out.println("1. Parentheses ()");
        System.out.println("2. Multiplication *, Division /, Modulus %");
        System.out.println("3. Addition +, Subtraction -");
        
        scanner.close();
    }
}