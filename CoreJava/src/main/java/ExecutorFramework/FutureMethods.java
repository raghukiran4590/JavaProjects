package ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureMethods {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService1 = Executors.newCachedThreadPool();
        // Use this for short tasks and variable execution time and not for longer execution time

        Future<Integer> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception Occurred "+e);
            }
            System.out.println("Hello");
            return 42;
        });

//        future.cancel(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred "+e);
        }
        future.cancel(false);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());


       /* Integer i = null;

        try {
            i = future.get(3, TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            System.out.println("Exception Occurred "+e);
        }*/

        executorService.shutdown();

    }
}
