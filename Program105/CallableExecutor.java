package Program105;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutor {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a number to calculate factorial: ");
        n = scan.nextInt();

        CallableMaker maker = new CallableMaker(n);

        try(ExecutorService service = Executors.newSingleThreadExecutor()) {
            Future<Long> result = service.submit(maker);
            System.out.printf("\nFactorial of %d is: %d\n\n", n, result.get());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage() + " occurred!!!");
        }

    }
}