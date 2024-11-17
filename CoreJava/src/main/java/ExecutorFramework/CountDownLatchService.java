package ExecutorFramework;

import java.util.concurrent.*;

public class CountDownLatchService {

    public static void main(String[] args) throws InterruptedException {

        int numberOfServices = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
//        latch.await();
        latch.await(3000, TimeUnit.MILLISECONDS);
        System.out.println("Main");

        executorService.shutdown();

    }

}

    class DependentService implements Callable<String> {

        private final CountDownLatch latch;

        public DependentService(CountDownLatch latch) {
            this.latch = latch;
        }


        @Override
        public String call() throws Exception {
            try{
                System.out.println(Thread.currentThread().getName() + " Service Started.");
//                Thread.sleep(2000);
                Thread.sleep(6000);
            } finally {
                latch.countDown();
            }

            return "OK";
        }
    }

