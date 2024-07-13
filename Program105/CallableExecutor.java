package Program105;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutor {
    @SuppressWarnings({ "unchecked", "resource" })
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        n = scan.nextInt();

        CallableMaker factorial = new CallableMaker(n);

        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            Future<Long> result = service.submit((Callable<Long>) factorial);
            System.out.printf("\nFactorial of %d is: %s", n, result.toString());
        } catch (Exception e) {
            System.out.println("Exception " + e + " occurred!!!");
        }

    }
}