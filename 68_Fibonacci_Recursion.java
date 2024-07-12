class FibonacciRecursion {
    
    int fibonacci(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }

        return fibonacci(position - 1) + fibonacci(position - 2);
    }
    
    public static void main(String args[]) {
        System.out.println("\nPrint Fibonacci Number Series Using Recursion\n");

        System.out.print("Enter number of elements to be printed: ");
        int n = VariableScanner.scanInt(true);

        FibonacciRecursion f = new FibonacciRecursion();

        System.out.print("Fibonacci series is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(f.fibonacci(i) + " ");
        }
        System.out.println();
    }

}