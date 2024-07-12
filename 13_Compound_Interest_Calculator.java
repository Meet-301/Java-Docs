import java.util.Scanner;

class test6 {
    public static void main(String args[]) {
        double p, t, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Compound Interest Calculator");

        System.out.println("Enter principle,rate,time");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();
        System.out.print("Answer is: " + (p * Math.pow((1 + r / 100), t)));

        sc.close();
    }
}