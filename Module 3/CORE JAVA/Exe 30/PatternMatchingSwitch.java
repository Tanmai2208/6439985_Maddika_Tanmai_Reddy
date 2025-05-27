import java.util.Scanner;

public class PatternMatchingSwitch {
    public static void printType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            case null -> System.out.println("Null object");
            default -> System.out.println("Unknown type");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Enter Integer");
        System.out.println("2. Enter String");
        System.out.println("3. Enter Double");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Object input;
        switch(option) {
            case 1:
                System.out.print("Enter integer: ");
                input = scanner.nextInt();
                break;
            case 2:
                System.out.print("Enter string: ");
                input = scanner.nextLine();
                break;
            case 3:
                System.out.print("Enter double: ");
                input = scanner.nextDouble();
                break;
            default:
                System.out.println("Invalid option");
                return;
        }
        
        printType(input);
        scanner.close();
    }
}