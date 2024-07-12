import java.util.Scanner;

class test20 {
    public static void main(String args[]) {
        System.out.println("\nLCM OF 2 NUMBERS\n");
        lcm();
    }

    public static void lcm() {
        int n1, n2, i = 1, match = 0, m = 0;
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        sc.close();
        if (n1 < 1 || n2 < 1) {
            System.out.println("\nNumbers must be greater than or equal to 1!!!");
        } else {
            while (match == 0) {
                m = (n2 * i);
                i++;

                if ((m % n1) == 0) {
                    match = 1;
                }
            }
            System.out.println("LCM of " + n1 + " and " + n2 + " = " + m);
        }
    }

}