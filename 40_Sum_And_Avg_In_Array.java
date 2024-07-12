class test28 {
    public static void main(String args[]) {
        System.out.println("\nSum and Average of Given Numbers\n");

        int[] numArray = ArrayUtility.inputArray();

        calculation(numArray);
    }

    public static void calculation(int[] arr) {
        int sum=0,i=0,avg=0;

        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        avg = sum/arr.length;

        System.out.println("\nSum = "+sum+" and Average = "+avg+"\n");
    }
}