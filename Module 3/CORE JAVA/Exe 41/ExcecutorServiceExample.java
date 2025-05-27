import java.util.concurrent.*;
import java.util.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            Callable<Integer> task = () -> {
                Thread.sleep(1000);
                return taskNumber * taskNumber;
            };
            futures.add(executor.submit(task));
        }
        
        for (Future<Integer> future : futures) {
            System.out.println("Result: " + future.get());
        }
        
        executor.shutdown();
    }
}