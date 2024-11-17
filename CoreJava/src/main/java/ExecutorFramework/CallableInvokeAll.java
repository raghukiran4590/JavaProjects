package ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableInvokeAll {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable1 = () -> {
            System.out.println("Task 1");
            Thread.sleep(1000);
            return 1;
        };
        Callable<Integer> callable2 = () ->  {
            System.out.println("Task 2");
            Thread.sleep(1000);
            return 2;
        };
        Callable<Integer> callable3 = () ->  {
            System.out.println("Task 3");
            Thread.sleep(1000);
            return 3;
        };

        List<Callable<Integer>> callables = Arrays.asList(callable1, callable2, callable3);
        try {
            List<Future<Integer>> futures = executorService.invokeAll(callables, 1, TimeUnit.SECONDS);
            for(Future<Integer> f: futures) {
                System.out.println(f.get());
            }
        } catch(CancellationException c) {
        }

        executorService.shutdown();

        System.out.println("Hello World");

    }
}
