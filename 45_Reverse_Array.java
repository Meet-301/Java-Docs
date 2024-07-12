class test33 {
    public static void main(String args[]) {
        System.out.println("\nReverse The Given Block of Numbers\n");

        int a[] = ArrayUtility.inputArray();

        if (a.length < 1) {
            System.out.println("\nPlease enter a valid size!!!\n");
        } else {
            reverse(a);
        }
    }

    public static void reverse(int[] arr) {
        int i = arr.length-1;

        System.out.print("\nReversed block is: ");
        while (i >= 0) {
            System.out.print(arr[i]+" ");
            i--;
        }
        System.out.println("\n");
    }
}