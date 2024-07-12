package Program103;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingleThreadedExecutor {
    public static void main(String args[]) {
        System.out.println("\nSingle Threaded Executor\n");

        ExecutorService exec = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 10; i++) {
            
        }
    }
}