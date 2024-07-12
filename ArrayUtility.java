import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        int n, i = 0;

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter block size: ");
        n = scan.nextInt();

        int[] a = new int[n];

        if (n <= 0) {
            System.out.println("\nInvalid size entered!!!");
        } else if (n == 1) {
            System.out.println("\nEnter " + n + " element");
            while (i < n) {
                a[i] = scan.nextInt();
                i++;
            }

            return a;
        } else {
            System.out.println("\nEnter " + n + " elements");
            while (i < n) {
                a[i] = scan.nextInt();
                i++;
            }

            return a;
        }

        return a;

    }

    public static int[][] input2DArray() {
        int r, c, i = 0, j = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        r = sc.nextInt();

        System.out.print("Enter no of columns: ");
        c = sc.nextInt();

        int[][] a = new int[r][c];

        if (r < 1 || c < 1) {
            System.out.println("\nInvalid size entered!!!\n");
            return null;
        } else {
            System.out.println();
            while (i < r) {
                j = 0;
                while (j < c) {
                    System.out.print("Enter element of row " + (i + 1) + ", column " + (j + 1) + ": ");
                    a[i][j] = sc.nextInt();
                    j++;
                }
                i++;
            }

            return a;
        }

        
    }

    public static void displayArray(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }

}