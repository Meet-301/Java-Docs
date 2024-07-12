import java.util.Scanner;

class test1 {
    public static void main(String args[]) {
        float n1, n2, add, sub, mul, div, mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();

        add = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        div = n1 / n2;
        mod = n1 % n2;

        System.out.println("Addition of entered 2 numbers is: " + add);
        System.out.println("Subtraction of entered 2 numbers is: " + sub);
        System.out.println("Multiplication of entered 2 numbers is: " + mul);
        System.out.println("Division of entered 2 numbers is: " + div);
        System.out.println("Modulus of entered 2 numbers is: " + mod);

        sc.close();
    }
}