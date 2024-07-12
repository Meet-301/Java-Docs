class test30 {
    public static void main(String args[]) {
        System.out.println("\nMaximum and Minimum Number Finder\n");

        int[] arr = ArrayUtility.inputArray();

        minmax(arr);
    }

    public static void minmax(int[] a) {

        if (a.length == 1) {
            System.out.println("\nMaximum And Minimum Number Isn't Possible for a Single Element!!!\n");
        } else if (a.length < 1) {
            System.out.println("\nPlease enter a valid size!!!\n");
        } else {
            int i = 1, max = a[0], min = a[0];
            while (i < a.length) {
                if (a[i] > max) {
                    max = a[i];
                }

                if (min > a[i]) {
                    min = a[i];
                }

                i++;
            }

            System.out.print("\nMaximum no. is: " + max + " and Minimum no. is: " + min + "\n\n");
        }

    }
}