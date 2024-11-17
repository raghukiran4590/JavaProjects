package ExecutorFramework;

import java.util.concurrent.*;

public class ScheduleExecutorService {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Task executed at every 5 seconds"),
                5,
                5,
                TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("Task executed with 5 seconds delay"),
                5,
                5,
                TimeUnit.SECONDS);

        scheduledExecutorService.schedule(() -> {
            System.out.println("Initiating shutdown....");
            scheduledExecutorService.shutdown();
            }, 20, TimeUnit.SECONDS);

//        scheduledExecutorService.shutdown();
    }
}
