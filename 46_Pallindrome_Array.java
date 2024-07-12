class test34 {
    public static void main(String args[]) {
        System.out.println("\nPallindrome Array Checker\n");
        boolean isPallindrome = false;

        int a[] = ArrayUtility.inputArray();

        if (a.length < 1) {
            System.out.println("\nPlease enter a valid size!!!\n");
        } else {
            isPallindrome = pallindrome(a);
        }

        if (isPallindrome) {
            System.out.println("\nArray is pallindrome\n");
        } else {
            System.out.println("\nArray isn't pallindrome\n");
        }
    }

    public static boolean pallindrome(int[] arr) {
        int[] arr2 = new int[arr.length];
        int i = arr.length - 1, j = 0, counter = 0;

        while (i >= 0) {
            arr2[j] = arr[i];
            i--;
            j++;
        }

        i = 0;
        while (i < arr.length) {
            if (arr[i] == arr2[i]) {
                counter++;
            }
            i++;
        }

        if (counter == arr.length) {
            return true;
        } else {
            return false;
        }
    }
}