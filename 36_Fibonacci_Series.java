import java.util.Scanner;

class test24 {
    public static void main(String args[]) {
        System.out.println("Fibonacci Series Generator");
        fibonacci();
    }

    public static void fibonacci() {
        int a = 0, b = 1, c, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        if (n < 0) {
            System.out.println("Negative number isn't allowed!!!");
        } else if (n == 0) {
            System.out.print("Fibonacci series till " + n + " is: 0 ");
        } else {
            System.out.print("Fibonacci series till " + n + " is: 0 1 ");
            while ((a + b) <= n) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}