class FunctionalProceduralDemo {
    public static void main(String args[]) {

        int i,fact = 1;

        System.out.println("\nFactorial Using Functional and Procedural Programming\n");

        // Using 
        System.out.print("Enter a number: ");
        int n = VariableScanner.scanInt(true);

        for (i = n; i > 0; i--) {
            fact = fact * i;
        }
    }
}