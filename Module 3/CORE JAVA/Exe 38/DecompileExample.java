public class DecompileExample {
    private String message;
    
    public DecompileExample(String message) {
        this.message = message;
    }
    
    public void printMessage() {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        DecompileExample example = new DecompileExample("Hello");
        example.printMessage();
    }
}