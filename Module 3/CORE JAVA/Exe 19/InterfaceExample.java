import java.util.Scanner;

interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Play Guitar");
        System.out.println("2. Play Piano");
        System.out.print("Choose instrument: ");
        int choice = scanner.nextInt();
        
        Playable instrument;
        if (choice == 1) {
            instrument = new Guitar();
        } else if (choice == 2) {
            instrument = new Piano();
        } else {
            System.out.println("Invalid choice");
            return;
        }
        
        System.out.print("Instrument sound: ");
        instrument.play();
        
        scanner.close();
    }
}