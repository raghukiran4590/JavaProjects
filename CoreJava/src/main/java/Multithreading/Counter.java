package Multithreading;

public class Counter {

    private int counter  = 0;

    public int getCounter() {
        return counter;
    }

    public synchronized void increment() {
        counter++;
    }
}
