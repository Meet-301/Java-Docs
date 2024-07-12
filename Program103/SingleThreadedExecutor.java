package Program103;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThreadedExecutor {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("\nSingle Threaded Executor\n");

        ExecutorService exec = Executors.newSingleThreadExecutor();
        PrintTask task = new PrintTask();

        exec.submit(task);

        exec.shutdown();
    }
}