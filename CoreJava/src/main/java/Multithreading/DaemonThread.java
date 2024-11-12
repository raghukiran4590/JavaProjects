package Multithreading;

public class DaemonThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while(true) {
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
//        DaemonThread t2 = new DaemonThread();
        t1.start();
//        t2.start();
        System.out.println("Main Done");
    }
}
