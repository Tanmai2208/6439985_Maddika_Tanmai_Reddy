import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Create Animal");
        System.out.println("2. Create Dog");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        
        Animal animal;
        if (option == 1) {
            animal = new Animal();
        } else if (option == 2) {
            animal = new Dog();
        } else {
            System.out.println("Invalid option");
            return;
        }
        
        System.out.print("Making sound: ");
        animal.makeSound();
        
        scanner.close();
    }
}