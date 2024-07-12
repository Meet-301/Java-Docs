class MaxUsingForEach {
    public static void main(String args[]) {
        System.out.println("\nMax Number Finder Using For Each Loop\n");

        int[] arr = ArrayUtility.inputArray();
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("\n" + max + " is maximum number\n");
    }
}