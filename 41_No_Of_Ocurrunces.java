import java.util.Scanner;

class test29 {
    public static void main(String args[]) {
        System.out.println("\nNumber of Occurrnces Finder\n");

        int[] a = ArrayUtility.inputArray();
        int counter = 0, search, i = 0;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a number you want to search: ");
        search = scan.nextInt();

        while (i < a.length) {
            if (a[i] == search) {
                counter++;
            }
            i++;
        }

        if (counter > 1) {
            System.out.println("There are total " + counter + " occurrunces of " + search + "\n");
        } else if (counter == 1) {
            System.out.println("There's total 1 occurrunce of " + search + "\n");
        } else {
            System.out.println("Oops!! " + search + " isn't available!!!\n");
        }
    }
}