import java.util.Scanner;

class test43 {
    public static void main(String args[]) {
        System.out.println("\nMonth Checker Using Ternary Operator\n");

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter month number: ");
        int month = scanner.nextInt();

        test43 obj = new test43();
        String result = obj.checkMonth(month);

        if (result != "Invalid number!!!") {
            System.out.println("\nMonth: " + result + "\n");
        } else {
            System.out.print(result);
        }
    }

    String checkMonth(int mon) {
        String ans = switch (mon) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid number!!!\n";
        };
        return ans;
    }
}