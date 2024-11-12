package Multithreading;

public class Demo implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World!");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
//        demo.run();
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(demo);
        t1.start();
        System.out.println(t1.getName());
    }
}
