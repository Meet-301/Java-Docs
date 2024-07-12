import java.util.Scanner;

class test17 {
    public static void main(String args[]) {
        System.out.println("\nOdd Number Sum Calculator\n");
        addition(scan());
    }

    public static void addition(int n) {
        int i = 1, sum = 0;
        if (n == 0) {
            return;
        } else {
            while (i <= n) {
                if ((i % 2) != 0) {
                    sum = sum + i;
                    i++;
                } else {
                    i++;
                }
            }
            System.out.println("\nSum of all odd numbers till " + n + " is: " + sum + "\n");
        }

    }

    public static int scan() {
        int n;
        System.out.print("Enter a number(>1): ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        if (n <= 1) {
            System.out.println("\nNumber must be greater than 1!!!");
            return 0;
        } else {
            return n;
        }
    }
}