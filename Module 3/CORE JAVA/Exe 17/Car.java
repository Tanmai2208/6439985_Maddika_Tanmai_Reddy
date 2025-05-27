import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        
        Car myCar = new Car(make, model, year);
        myCar.displayDetails();
        
        scanner.close();
    }
}