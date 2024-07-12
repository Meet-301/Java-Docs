import java.util.Scanner;

class test44 {

    int calculator(int num1, int num2, String operation) {
        int ans, start, answer = 1;

        for (start = 1; start <= num2; start++) {
            answer = answer * num1;
        }

        ans = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "^" -> answer;
            default -> 0;
        };

        return ans;
    }

    public static void main(String args[]) {
        System.out.println("\nCalculator Using Switch Case\n");

        System.out.println("Enter 2 numbers");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        String opr;

        n1 = VariableScanner.scanInt(true);
        n2 = VariableScanner.scanInt(true);

        System.out.print("Enter an operation: ");
        opr = scan.nextLine();

        test44 tst = new test44();
        int ans = tst.calculator(n1, n2, opr);

        if (ans != 0) {
            System.out.println("\nAnswer is: " + ans + "\n");
        } else {
            System.out.println("\nEntered operation isn't supported!!!\n");
        }
    }
}