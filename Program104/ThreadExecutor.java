package Program104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService exec = Executors.newFixedThreadPool(3);

        ThreadMaker task1 = new ThreadMaker();
        ThreadMaker task2 = new ThreadMaker();
        ThreadMaker task3 = new ThreadMaker();

        exec.submit(task1);
        exec.submit(task2);
        exec.submit(task3);

        System.out.println("\n");

        exec.shutdown();

        if (!exec.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("EMERGENCY SHUTDOWN!!!");
            exec.shutdownNow();
        }
    }
}