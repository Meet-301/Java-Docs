import java.util.Scanner;

class test {
     public static void main(String args[]) {
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextFloat();
        System.out.print("Enter second number: ");
        b = sc.nextFloat();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapped numbers are: a = "+a+" and b = "+b);
        sc.close();
    }
}