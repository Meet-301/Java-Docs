import java.util.Scanner;

class test3 {
    public static void main(String args[]) {
        float a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter of Rectangle Calculator");

        System.out.println("Enter 4 sides");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        System.out.println("Perimeter of rectangle is: " + (a + b + c + d));

        sc.close();
    }
}