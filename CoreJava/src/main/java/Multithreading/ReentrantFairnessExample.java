package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantFairnessExample {

    private final Lock lock = new ReentrantLock(true);

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() +" acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " release the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReentrantFairnessExample example = new ReentrantFairnessExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        //If we want to maintain the order of thread execution use the below steps.
//        thread1.sleep(100);
//        thread1.join();
        thread2.start();
//        thread2.sleep(100);
//        thread2.join();
        thread3.start();

    }
}
