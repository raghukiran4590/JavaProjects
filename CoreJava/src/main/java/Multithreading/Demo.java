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

    //When extending thread class, we are restricting the class to extend from other classes
    //When implementing the runnable interface, the class can implement other classes and well as extend from one other class.
    //run() method just executes the method but do not implement multi threading and does sequential processing
    //start() method creates a new thread and puts the thread into runnable and then running based on CPU execution order.

}
