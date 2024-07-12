import java.util.Scanner;

class test40 {
    public static void main(String args[]) {
        System.out.println("\nOdd Even Checker Using Ternary Operator\n");

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        float n;
        String ans;

        System.out.print("Enter a number: ");
        n = scan.nextFloat();

        ans = n % 2 == 0 ? "even" : "odd";

        System.out.println("\n" + n + " is " + ans + "\n");
    }
}