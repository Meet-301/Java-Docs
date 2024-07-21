package Program110;

import java.util.Scanner;

public class Tester {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("\nPrime Number Checker\n");

        Functional_Interface fi = new Functional_Interface() {
            public boolean isPrime(int n) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        return true;
                    }
                }
                return false;
            };
        };

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();
    
        boolean primeNum = fi.isPrime(n);

        if (primeNum) {
            System.out.printf("%s is prime number",n);
        } else {
            System.out.printf("%s isn't a prime number",n);
        }
    }
}