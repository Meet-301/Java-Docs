class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }

}

public class PassByReference {

    static void swap(IntWrapper num1, IntWrapper num2) {
        int tmp = num1.value;
        num1.value = num2.value;
        num2.value = tmp;
    }

    public static void main(String[] args) {
        IntWrapper n1, n2;

        System.out.println("Welcome to swapping program");

        System.out.print("Enter number 1: ");
        n1 = new IntWrapper(VariableScanner.scanInt(true));

        System.out.print("Enter number 2: ");
        n2 = new IntWrapper(VariableScanner.scanInt(true));

        System.out.println("\nBefore Swapping");
        System.out.printf("Number 1 = %d and Number 2 = %d\n", n1.value, n2.value);

        swap(n1, n2);
        System.out.println("\nAfter Swapping");
        System.out.printf("Number 1 = %d and Number 2 = %d\n", n1.value, n2.value);
    }

}