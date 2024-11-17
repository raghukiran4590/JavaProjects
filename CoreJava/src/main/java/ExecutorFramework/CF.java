package ExecutorFramework;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CF {

    public static void main(String[] args) {

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "OK";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "OK";
        });

        try {
            String f3 = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Worker");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "OK";
            }).get();
            System.out.println(f3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        try {
            CompletableFuture<String> f4 = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Worker");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "OK";
            }).thenApply(x -> x+x);
            System.out.println(f4.get());

        } catch (Exception e) {
        }

        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);

        try {
            f.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

//        f.join(); Join can also be used instead of get() method

            CompletableFuture<String> f5 = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Worker");
                } catch (Exception e) {
                }
                return "OK";
            }).orTimeout(1000, TimeUnit.MILLISECONDS).exceptionally(s -> "Timeout Occurred.");

        try {
            System.out.println(f5.get());
        } catch (InterruptedException e) {
        } catch (ExecutionException e) {
        }

        System.out.println("Done");

    }
}
