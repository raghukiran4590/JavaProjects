package ExecutorFramework;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity {
    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }


    public static void main(String[] args) throws InterruptedException {

        Atomicity atom = new Atomicity();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                atom.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                atom.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter : "+atom.getCounter());
    }
}
