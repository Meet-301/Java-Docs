class RecursionMultiply {

    public static int printMultiplication(int b, int p, int current, int result) {
        if (current > p) {
            return result;
        }
        return printMultiplication(b, p, current + 1, result * b);
    }

    public static void main(String args[]) {
        System.out.println("\nPrint the multiplication of number till n\n");

        System.out.print("\nEnter base: ");
        int base = VariableScanner.scanInt(true);
        System.out.print("\nEnter power: ");
        int power = VariableScanner.scanInt(true);

        System.out.print("\nMultiplication is: " + printMultiplication(base, power, 1, 1) + "\n\n");
    }
}