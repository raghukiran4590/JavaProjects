package ExecutorFramework;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("Callable Task");
        Thread.sleep(1000);
        return null;
    }
}
