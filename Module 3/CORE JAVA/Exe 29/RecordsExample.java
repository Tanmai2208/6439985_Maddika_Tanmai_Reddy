import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many people? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        List<Person> people = new java.util.ArrayList<>();
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name for person " + (i+1) + ": ");
            String name = scanner.nextLine();
            
            System.out.print("Enter age for person " + (i+1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            people.add(new Person(name, age));
        }
        
        System.out.println("\nAll people:");
        people.forEach(System.out::println);
        
        System.out.print("\nEnter minimum age to filter: ");
        int minAge = scanner.nextInt();
        
        List<Person> filtered = people.stream()
                                    .filter(p -> p.age() >= minAge)
                                    .collect(Collectors.toList());
        
        System.out.println("\nPeople aged " + minAge + " or older:");
        filtered.forEach(System.out::println);
        
        scanner.close();
    }
}