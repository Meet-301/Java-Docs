import java.util.Scanner;

class test5 {
    public static void main(String args[]) {
        float p, t, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest Calculator");

        System.out.println("Enter principle,rate,time");
        p = sc.nextFloat();
        r = sc.nextFloat();
        t = sc.nextFloat();
        System.out.print("Answer is: " + ((p * r * t) / 100)+"rs");

        sc.close();
    }
}