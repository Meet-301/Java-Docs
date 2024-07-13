package Program105;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutor {
    @SuppressWarnings({ "unchecked", "unused", "resource" })
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        n = scan.nextInt();

        CallableMaker factorial = new CallableMaker(n);

        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            Future<Long> result = service.submit((Callable<Long>) factorial);
        } catch (Exception e) {
            System.out.println("Exception " + e + " occurred!!!");
        }

    }
}