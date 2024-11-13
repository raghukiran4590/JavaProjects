package Multithreading;

public class SyncDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
        SyncThread sync1 = new SyncThread(counter);
        SyncThread sync2 = new SyncThread(counter);
        sync1.start();
        sync2.start();
        try {
            sync1.join();
            sync2.join();
        } catch(InterruptedException ie) {
            System.out.println(ie);
        }

        System.out.println(counter.getCounter());
    }
}
