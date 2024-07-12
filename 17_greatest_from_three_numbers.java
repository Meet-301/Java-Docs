import java.util.Scanner;

class test10 {
    public static void main(String args[]) {
        float n1, n2, n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is largest");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is largest");
        } else {
            System.out.println(n3 + " is largest");
        }

        sc.close();
    }
}