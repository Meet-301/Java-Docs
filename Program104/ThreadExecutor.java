package Program104;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadExecutor {
    public static void main(String[] args) {
        Executor exec = Executors.newFixedThreadPool(3);
    }
}
