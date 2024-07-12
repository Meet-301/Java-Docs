class Recursion_N_Numbers {

    public static void sum(int limit, int i, int sum) {

        if (i == limit) {
            sum += i;
            System.out.println("\nSum of all numbers till " + limit + " is: " + sum + "\n");
            return;
        }

        sum += i;
        sum(limit, i + 1, sum);
    }

    public static void main(String args[]) {
        System.out.println("\nSum of first n natural numbers using recursion\n");

        int n = VariableScanner.scanInt(false), i = 0, sum = 0;

        sum(n, i, sum);
    }

}