package Program105;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableExecutor {
    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        n = scan.nextInt();

        CallableMaker factorial = new CallableMaker(n);
    }
}
