import java.util.Scanner;

class test41 {
    public static void main(String args[]) {
        System.out.println("\nAbsolute Number Converter Using Ternary Operator\n");

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n, abs;

        System.out.print("Enter a number: ");
        n = scan.nextInt();

        abs = n < 0 ? 0-n : n;
        
        System.out.println("\nAbsolute value of "+n+" is "+abs+"\n");
    }
}