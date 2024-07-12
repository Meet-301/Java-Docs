import java.util.Scanner;

class test26 {
    public static void main(String args[]) {
        System.out.println("\nPallindrome Number Checker\n");

        int number;
        boolean pallindrome;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        sc.close();

        pallindrome = isPallindrome(number);

        if (pallindrome) {
            System.out.println(number + " is a pallindrome number\n");
        } else {
            System.out.println(number + " isn't a pallindrome number\n");
        }
    }

    public static boolean isPallindrome(int num) {
        int sum = 0, n = num, lastDigit;

        while (num > 0) {
            lastDigit = num % 10;
            sum = (sum * 10) + lastDigit;
            num /= 10;
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }
}