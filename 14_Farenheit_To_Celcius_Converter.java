import java.util.Scanner;

class test7 {
    public static void main(String args[]) {
        float f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Farenheit to Celcius Converter");

        System.out.print("Enter the value of farenheit: ");
        f = sc.nextInt();
        c = (f - 32) * 5 / 9;
        System.out.println(f + " Farenheit = " + c + " Celcius");

        sc.close();
    }
}