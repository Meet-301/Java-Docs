import java.util.Scanner;

class test25 {
    public static void main(String args[]) {
        System.out.println("\nArmstrong Number Checker\n");
        int n;
        boolean isArmstrong;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();

        isArmstrong = armstrong(n);
        if (isArmstrong) {
            System.out.println(n + " is a armstrong number\n");
        } else {
            System.out.println(n + " isn't an armstrong number\n");
        }
    }

    public static boolean armstrong(int n) {
        int counter = 0, num = n, mod, total = 0, number = n;

        while (n > 0) {
            counter++;
            n /= 10;
        }

        while (num > 0) {
            mod = num % 10;
            total += Math.pow(mod, counter);
            num /= 10;
        }

        return total == number;
    }
}