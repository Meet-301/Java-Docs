import java.util.Scanner;

class test36 {
    public static void main(String args[]) {
        int search;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSearch in 2D Array\n");

        int[][] a = ArrayUtility.input2DArray();

        System.out.print("\nEnter a number you want to search: ");
        search = scan.nextInt();

        boolean isFound = search(a, search);

        if (isFound) {
            System.out.println(search + " is found in the array\n");
        } else {
            System.out.println(search + " isn't found in the array\n");
        }
    }

    public static boolean search(int[][] arr, int search) {
        int i = 0, j = 0;

        while (i < arr.length) {
            j = 0;
            while (j < arr[i].length) {
                if (arr[i][j] == search) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}