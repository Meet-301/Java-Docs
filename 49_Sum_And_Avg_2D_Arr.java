class test37 {
    public static void main(String args[]) {
        System.out.println("\nSum And Average of All Elements in 2D Array\n");

        int a[][] = ArrayUtility.input2DArray();

        if (a != null) {
            int sum = sum(a);
            double avg = avg(a);
            System.out.println("\nSum is: " + sum + " and Average is: " + avg + "\n");
        }
    }

    public static int sum(int[][] arr) {
        int i = 0, j = 0, sum = 0;

        while (i < arr.length) {
            j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static double avg(int[][] arr) {
        int sum = sum(arr), rows = arr.length, cols = arr[0].length;
        double size = rows * cols, avg = 0;
        avg = sum / size;
        return avg;
    }
}