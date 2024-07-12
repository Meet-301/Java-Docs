import java.util.Scanner;

class test22 {
    public static void main(String args[]) {
        System.out.println("\nPrime Number Checker\n");
        prime();
    }

    public static void prime() {
        int n, i = 2;
        boolean prime = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        while (i < n) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        }

        if (prime) {
            System.out.println(n + " is prime number\n");
        } else {
            System.out.println(n + " is non-prime number\n");
        }
    }
}