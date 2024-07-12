import java.util.Scanner;

class test2 {
    public static void main(String args[]) {
        float n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Product calculator");

        System.out.println("Enter 2 fractional numbers: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        System.out.print("Product of given 2 numbers is: " + (n1 * n2));

        sc.close();
    }
}