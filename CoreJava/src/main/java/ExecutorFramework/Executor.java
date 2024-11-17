package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Executor {


    public static int factorial(int number) {
        int result = 1;
        for(int i=1; i<=number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i=1; i<10; i++) {
            int finalI = i;
            Future<?> submit = executorService.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }

        executorService.shutdown();
        try {
//            executorService.awaitTermination(1, TimeUnit.SECONDS);
            while(!executorService.awaitTermination(10, TimeUnit.MILLISECONDS)) {
                System.out.println("Waiting...."); }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("Total Time taken : "+(System.currentTimeMillis() - startTime));
    }
}
