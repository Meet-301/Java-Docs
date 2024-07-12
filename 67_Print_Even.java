class PrintEven {
    public static void main(String args[]) {
        System.out.println("\nPrint Only Even Numbers\n");

        int[] a = ArrayUtility.inputArray();

        System.out.print("\nAll the even numbers are: ");
        for (int i : a) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}