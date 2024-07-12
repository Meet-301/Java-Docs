import java.util.Scanner;

class test9 {
    public static void main(String args[]) {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Odd Even Checker\n");

        System.out.print("Enter any number: ");
        n = sc.nextFloat();

        if ((n%2)==0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }

        sc.close();
    }
}