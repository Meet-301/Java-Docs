import java.util.Scanner;

class test8 {
    public static void main(String args[]) {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.println("The Number Checker\n");

        System.out.print("Enter any number: ");
        n = sc.nextFloat();
        
        if (n>0) {
            System.out.println("Entered number is positive");
        }
        else if (n<0) {
            System.out.println("Entered number is negative");
        }
        else {
            System.out.println("Entered number is zero");
        }

        sc.close();
    }
}