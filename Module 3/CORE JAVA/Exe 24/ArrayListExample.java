import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a name (or 'quit' to stop): ");
            String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("quit")) {
                break;
            }
            names.add(name);
        }
        
        System.out.println("\nNames entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}