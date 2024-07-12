import java.util.Scanner;

class test27 {
    public static void main(String args[]) {
        System.out.println("\nPattern Printer\n");
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        number = sc.nextInt();
        sc.close();

        print(number);
    }

    public static void print(int n) {
        int i = 0, j = 1, i1 = n, j1 = 1, i2 = 0, j2 = 0, rows = n;
        System.out.println("\nRight Half Pyramid\n");

        while (i < n) {
            System.out.print("*");
            j = 1;
            while (j < i + 1) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("\n\nReverse Right Half Pyramid\n");

        while (i1 > 0) {
            System.out.print("*");
            j1 = 1;
            while (j1 < i1) {
                System.out.print(" *");
                j1++;
            }
            System.out.println();
            i1--;
        }

        System.out.println("\n\nLeft Half Pyramid\n");

        while (rows > 0) {

            j2 = 0;
            while (j2 < (rows - 1)) {
                System.out.print("  ");
                j2++;
            }

            i2 = 0;
            while (i2 <= (n - rows)) {
                System.out.print("* ");
                i2++;
            }
            System.out.println();
            rows--;
        }
    }
}