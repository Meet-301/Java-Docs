package Program105;

import java.util.Scanner;

public class CallableExecutor {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        n = scan.nextInt();

        CallableMaker factorial = new CallableMaker(n);
    }
}
