import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LambdaExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter names separated by commas: ");
        String input = scanner.nextLine();
        List<String> names = Arrays.asList(input.split(","));
        
        System.out.println("Original list: " + names);
        
        // Sort using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted list: " + names);
        
        scanner.close();
    }
}