class test31 {
    public static void main(String args[]) {
        System.out.println("\nCheck Whether Given Elements are Sorted or Not\n");

        int[] arr = ArrayUtility.inputArray();

        if (arr.length < 1) {
            System.out.println("\nPlease enter valid size!!!\n");
        } else if (arr.length == 1) {
            System.out.println("\nSingle element is already sorted!\n");
        } else {
            boolean isSortedAccending = checkaccending(arr), isSortedDecending = checkdecending(arr);

            if (isSortedAccending) {
                System.out.println("\nAll the elements are sorted in accending order\n");
            } else if (isSortedDecending) {
                System.out.println("\nAll the elements are sorted in decending order\n");
            } else {
                System.out.println("\nElements are not sorted!!\n");
            }
        }

    }

    public static boolean checkaccending(int[] a) {
        int counter = 0, i = 0;

        while (i < a.length - 1) {
            if (a[i] < a[i + 1]) {
                counter++;
            }
            i++;
        }

        if (counter == a.length - 1) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkdecending(int[] a) {
        int counter = 0, i = 0;

        while (i < a.length - 1) {
            if (a[i] > a[i + 1]) {
                counter++;
            }
            i++;
        }

        if (counter == a.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}