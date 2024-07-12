import java.util.Scanner;

class test39 {
    public static void main(String args[]) {
        System.out.println("\nMax Number from 2 Numbers Using Ternary Operator\n");

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        float n1, n2, max;

        System.out.println("Enter 2 numbers");
        n1 = scan.nextFloat();
        n2 = scan.nextFloat();

        max = n1 > n2 ? n1 : n2;

        System.out.println("\nMaximum number is: " + max + "\n");
    }
}