import java.util.Scanner;

class ArmstrongRecursion {
    public static void main(String args[]) {
        System.out.println("\nArmstrong Number Check Using Recursion\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int numDigits = countDigits(num);

        if (isArmstrong(num, numDigits)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        sc.close();
    }

    public static int countDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + countDigits(num / 10);
    }

    public static boolean isArmstrong(int num, int numDigits) {
        return num == sumOfPowers(num, numDigits);
    }

    public static int sumOfPowers(int num, int numDigits) {
        if (num == 0)
            return 0;
        int digit = num % 10;
        return (int) Math.pow(digit, numDigits) + sumOfPowers(num / 10, numDigits);
    }
}