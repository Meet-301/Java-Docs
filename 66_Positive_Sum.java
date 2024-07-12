class PositiveNumberSum {
    public static void main(String args[]) {
        System.out.println("\nSum of All Positive Numbers\n");

        int[] arr = ArrayUtility.inputArray();
        int sum = 0;

        for (int i : arr) {
            if (i < 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("\nSum of all positive numbers is: " + sum + "\n");
    }
}