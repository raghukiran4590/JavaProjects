package ExecutorFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureService {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "OK";
        });

        String s = null;
        s = completableFuture.getNow("NO");

        /*try {
            s = completableFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println(s);
        System.out.println("Main");
    }
}
