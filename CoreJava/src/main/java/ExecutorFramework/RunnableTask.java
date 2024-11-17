package ExecutorFramework;

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable Task");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
