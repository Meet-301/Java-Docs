class NoOfOccurrencesForEach {
    public static void main(String args[]) {
        System.out.println("\nNo of Occurrences\n");

        int[] a = ArrayUtility.inputArray();
        int count = 0, n = VariableScanner.scanInt(false);

        for (int i : a) {
            if (n == i) {
                count++;
            }
        }

        System.out.println("\n" + n + " is available " + count + " times in the array\n");
    }
}