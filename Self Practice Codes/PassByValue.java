public class PassByValue {

    static void swap(int num1, int num2) {
        int tmp;
        tmp = num1;
        num1 = num2;
        num2 = tmp;
    }

    public static void main(String[] args) {

        int n1, n2;

        System.out.println("Welcome to swapping program");

        System.out.print("Enter number 1: ");
        n1 = VariableScanner.scanInt(true);

        System.out.print("Enter number 2: ");
        n2 = VariableScanner.scanInt(true);

        System.out.println("\nBefore Swapping");
        System.out.printf("Number 1 = %d and Number 2 = %d\n", n1, n2);

        swap(n1, n2);
        System.out.println("\nAfter Swapping");
        System.out.printf("Number 1 = %d and Number 2 = %d\n", n1, n2);

    }
}