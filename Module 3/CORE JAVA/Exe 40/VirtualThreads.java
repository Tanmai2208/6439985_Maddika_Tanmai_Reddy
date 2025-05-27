public class VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        
        int numberOfThreads = 100_000;
        Thread[] threads = new Thread[numberOfThreads];
        
        for (int i = 0; i < numberOfThreads; i++) {
            int threadNumber = i;
            threads[i] = Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(100);
                    System.out.println("Virtual thread " + threadNumber + " completed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        
        for (Thread thread : threads) {
            thread.join();
        }
        
        long duration = System.currentTimeMillis() - start;
        System.out.println("Completed " + numberOfThreads + 
                         " virtual threads in " + duration + "ms");
    }
}