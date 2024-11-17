package ExecutorFramework;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Callable<String> callable = () -> "Hello";
//        Future<String> future = executorService.submit(callable);
        Future<?> future = executorService.submit(() -> System.out.println("Hello"));
        Future<String> submit = executorService.submit(() -> System.out.println("Runnable with result"), "Success");
//        Future<Integer> future = executorService.submit(() -> 42);
//        future.get();

        executorService.shutdown();
    }
}
