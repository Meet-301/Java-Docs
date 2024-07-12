class test38 {
    public static void main(String args[]) {
        System.out.println("\nSum of diagonal elements\n");

        int[][] arr = ArrayUtility.input2DArray();

        if (arr != null) {
            long sum = totalSum(arr);
            System.out.println("\nSum is: " + sum + "\n");
        }
    }

    public static long sumOfLeftDiagonal(int[][] a) {
        int i = 0;
        long sum = 0;

        while (i < a.length) {
            sum += a[i][i];
            i++;
        }

        return sum;
    }

    public static long totalSum(int[][] a) {
        long sum = sumOfLeftDiagonal(a) + sumOfRightDiagonal(a);
        int ind = a.length / 2;

        if (a.length % 2 != 0) {
            sum -= a[ind][ind];
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] a) {
        int i = 0, col = 0;
        long sum = 0;

        while (i < a.length) {
            col = a.length - 1 - i;
            sum += a[i][col];
            i++;
        }

        return sum;
    }
}