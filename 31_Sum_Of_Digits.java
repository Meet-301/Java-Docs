import java.util.Scanner;

class test19 {
    public static void main(String args[]) {
        sod(scan());
    }

    public static void sod(int num) {
        if (num != 0) {
            int sum = 0;

            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }
            System.out.println("Sum of digits of entered number is: " + sum);
        }
    }

    public static int scan() {
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        if (n < 1) {
            System.out.println("\nNumber must be greater than or equal to 1!!!");
            return 0;
        } else {
            return n;
        }
    }
}