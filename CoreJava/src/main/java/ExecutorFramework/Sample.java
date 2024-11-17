package ExecutorFramework;

public class Sample {

    public static int factorial(int number) {
        int result = 1;
        for(int i=1; i<=number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[9];
        long startTime = System.currentTimeMillis();
        for(int i=1; i<10; i++) {
            int finalI = i;
            threads[i-1] = new Thread(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
            threads[i-1].start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total Time taken : "+(System.currentTimeMillis() - startTime));
    }
}
