package Multithreading;

public class SyncThread extends Thread{

    Counter counter;

    public SyncThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            counter.increment();
        }
    }
}