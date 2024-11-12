package Multithreading;

public class Test extends Thread{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+"Running!"+Thread.currentThread().getState());
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(Thread.currentThread().getState());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName()+"/"+Thread.currentThread().getState());
        Test t1 = new Test();
//        t1.run();
//        System.out.println(t1.getState());
        t1.start();
//        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
