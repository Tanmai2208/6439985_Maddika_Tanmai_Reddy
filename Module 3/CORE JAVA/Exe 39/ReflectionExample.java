import java.lang.reflect.Method;

public class ReflectionExample {
    public static void printMessage(String msg) {
        System.out.println("Message: " + msg);
    }
    
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");
        
        System.out.println("Methods in ReflectionExample:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName() + " - Parameters: " + method.getParameterCount());
        }
        
        Method printMethod = clazz.getMethod("printMessage", String.class);
        printMethod.invoke(null, "Hello from reflection");
    }
}