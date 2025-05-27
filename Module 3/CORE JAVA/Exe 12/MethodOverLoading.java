import java.util.Scanner;

public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        
        switch(option) {
            case 1:
                System.out.print("Enter first integer: ");
                int a = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int b = scanner.nextInt();
                System.out.println("Result: " + add(a, b));
                break;
                
            case 2:
                System.out.print("Enter first double: ");
                double x = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double y = scanner.nextDouble();
                System.out.println("Result: " + add(x, y));
                break;
                
            case 3:
                System.out.print("Enter first integer: ");
                int i = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int j = scanner.nextInt();
                System.out.print("Enter third integer: ");
                int k = scanner.nextInt();
                System.out.println("Result: " + add(i, j, k));
                break;
                
            default:
                System.out.println("Invalid option");
        }
        
        scanner.close();
    }
}