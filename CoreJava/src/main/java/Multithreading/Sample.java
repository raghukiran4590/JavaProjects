package Multithreading;

public class Sample extends Thread{
    public Sample(String t1) {
        super(t1);
    }

    @Override
    public void run() {

        for(int i=0; i<5; i++) {
            try {
                String a = "";
//                Thread.sleep(1000);
                for(int j=0; j<10000; j++) {
                    a+="a";
                }
//                Thread.yield();
                System.out.println("Thread : "+Thread.currentThread().getName()+"/ Priority : "+Thread.currentThread().getPriority());
            }
//            catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            System.out.println("Thread Interrupted"+Thread.currentThread().getName());
//            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
//            throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Sample t1 = new Sample("t1");
        Sample t2 = new Sample("t2");
        Sample t3 = new Sample("t3");
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
//        t1.interrupt();
//        t1.join();

    }
}
