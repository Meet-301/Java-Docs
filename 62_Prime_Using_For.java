class PrimeUsingFor {
    public static void main(String args[]) {
        System.out.println("\nPrime Number Checker Using For Loop\n");

        int n = VariableScanner.scanInt(false);
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("\n" + n + (isPrime ? " is a prime number\n" : " isn't a prime number\n"));
    }
}