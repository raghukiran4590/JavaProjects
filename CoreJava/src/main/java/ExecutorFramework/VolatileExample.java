package ExecutorFramework;

public class VolatileExample {

    private volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Writer thread made the flag true");
        this.flag = true;
    }

    public void printIfFlagTrue() {
        while(!flag) {
            //Keep this thread waiting
        }
        System.out.println("Flag is true");
    }

    public static void main(String[] args) {
        VolatileExample vol = new VolatileExample();

        Thread t1 = new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            vol.setFlagTrue();
        });

        Thread t2 = new Thread(() -> vol.printIfFlagTrue());

        t1.start();
        t2.start();

    }
}
