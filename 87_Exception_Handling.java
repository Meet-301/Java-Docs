import java.util.Scanner;

class ExceptionHandling {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        System.out.println("\nDivision of 2 Numbers");

        Scanner scan = new Scanner(System.in);

        double n1, n2, ans = 0;

        System.out.println("\nEnter 2 numbers");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();

        try {
            if (n2 == 0) {
                throw new ArithmeticException("/ by zero");
            }
            ans = n1 / n2;
            System.out.println("Division is: " + ans);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("You can't divide a number by 0!!!");
            } else {
                System.out.println("Exception " + e.getMessage() + " has been occured!!!");
            }
        }

    }
}