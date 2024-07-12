import java.util.Scanner;

class test14 {
    public static void main(String args[]) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitwise Operator Calculator");

        System.out.println("Enter 2 numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println(n1 + " & " + n2 + " = " + (n1 & n2));
        System.out.println(n1 + " | " + n2 + " = " + (n1 | n2));
        System.out.println(n1 + " ^ " + n2 + " = " + (n1 ^ n2));
        System.out.println("!" + n1 + " = " + (~n1));
        System.out.println("!" + n2 + " = " + (~n2));
        System.out.println(n1 + "<<1 = " + (n1 << 1));
        System.out.println(n2 + "<<1 = " + (n2 << 1));
        System.out.println(n1 + ">>1 = " + (n1 >> 1));
        System.out.println(n2 + ">>1 = " + (n2 >> 1));

        sc.close();
    }
}