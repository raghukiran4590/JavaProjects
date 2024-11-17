package Multithreading;

public class LambdaThread {

    public static void main(String[] args) {
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Task1");
            }
        };
        Runnable task2 = () -> System.out.println("Hello Task2");

        Thread thread1 = new Thread(() -> {
            for (int i=0; i<9; i++) {
                System.out.println("Hello Thread-1");
            }
        });

        task1.run();
        task2.run();
        thread1.start();
    }
}
