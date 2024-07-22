import java.util.stream.IntStream;

class FunctionalProceduralDemo {
    public static void main(String args[]) {

        int i, fact = 1;

        System.out.println("\nFactorial Using Functional and Procedural Programming\n");

        // Using Procedural Code
        System.out.println("Procedural Code\n");
        System.out.print("Enter a number: ");
        int n = VariableScanner.scanInt(true);

        for (i = n; i > 0; i--) {
            fact *= i;
        }

        System.out.printf("\nFactorial of %d is %d\n", n, fact);

        // Using Functional Code
        IntStream.rangeClosed(2, n)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);

    }
}