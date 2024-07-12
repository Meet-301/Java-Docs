import java.util.Scanner;

class test18 {
    public static void main(String args[]) {
        int i = 1, n;
        long fact = 1;
        System.out.println("\nFactorial Calculator\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + fact + "\n");

        sc.close();
    }
}