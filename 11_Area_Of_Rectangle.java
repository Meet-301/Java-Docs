import java.util.Scanner;

class test4 {
    public static void main(String args[]) {
        float b, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate area of triangle");

        System.out.print("Enter base: ");
        b = sc.nextFloat();
        System.out.print("Enter height: ");
        h = sc.nextFloat();
        System.out.println("Area of triangle: " + (0.5) * b * h);

        sc.close();
    }
}