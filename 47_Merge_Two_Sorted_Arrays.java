class test35 {
    public static void main(String args[]) {
        int i = 0;
        System.out.println("\nMerge 2 Sorted Arrays\n");

        System.out.println("\nPlease Enter 2 Sorted Arrays in Accending Order\n");
        int[] a1 = ArrayUtility.inputArray();
        int[] a2 = ArrayUtility.inputArray();
        int[] a3 = new int[a1.length + a2.length];

        if (a1.length < 1 || a2.length < 1) {
            System.out.println("\nPlease enter valid size!!!\n");
        } else {
            a3 = merge(a1, a2);
        }

        System.out.print("\nMerged Array is: ");
        while (i < a3.length) {
            System.out.print(a3[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        return arr3;
    }
}