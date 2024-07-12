import java.util.Scanner;

class test21 {
    public static void main(String args[]) {
        System.out.println("\nGCD OF 2 NUMBERS\n");
        gcd();
    }

    public static void gcd() {
        int n1, n2, i = 2, gcd = 1, min;
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        min = Math.min(n1, n2);
        sc.close();
        if (n1 < 1 || n2 < 1) {
            System.out.println("\nNumbers must be greater than or equal to 1!!!");
        } else {
            while (i <= min) {
                if ((n1 % i) == 0 && (n2 % i) == 0) {
                    gcd = i;
                }
                i++;
            }
            System.out.println("GCD of " + n1 + " and " + n2 + " = " + gcd + "\n");
        }
    }
}