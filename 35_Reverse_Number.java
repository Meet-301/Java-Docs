import java.util.Scanner;

class test23 {
    public static void main(String args[]) {
        System.out.println("\nReverse Number Generator\n");

        int n, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        ans = reverse(n);
        System.out.println("Reverse of " + n + " is: " + ans + "\n");
    }

    public static int reverse(int num) {
        int mod = 1, sum = 0;

        while (num > 0) {
            mod = num % 10;
            sum = (sum * 10) + mod;
            num /= 10;
        }
        return sum;
    }
}