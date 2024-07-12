import java.util.Arrays;

class ArrayOperations {

    private static class Statistics {

        double median(double[] a) {

            Arrays.sort(a);

            boolean odd = false;
            double median = 0;
            int startingCounter = 0, endingCounter = a.length - 1;

            if (a.length % 2 != 0) {
                odd = true;
            }

            if (odd) {

                for (int i = 0; i < a.length; i++) {

                    startingCounter++;
                    endingCounter--;

                    if (startingCounter == endingCounter) {
                        median = a[startingCounter];
                        break;
                    }

                }

            } else {

                for (int i = 0; i < a.length; i++) {

                    startingCounter++;
                    endingCounter--;

                    if (startingCounter == endingCounter - 1) {
                        median = (a[startingCounter] + a[endingCounter]) / 2;
                        break;
                    }

                }

            }

            return median;

        }

        double mean(double[] a) {

            double mean, sum = 0;

            for (double d : a) {
                sum += d;
            }

            mean = sum / a.length;

            return mean;
        }

    }

    public static void main(String args[]) {

        System.out.println("\nArray Operations\n");

        int n, i;

        System.out.print("Enter array size: ");
        n = VariableScanner.scanInt(true);

        if (n <= 0) {
            System.out.println("Invalid size entered!!!");
        }

        double[] arr = new double[n];

        System.out.println("\nEnter " + n + " elements");

        for (i = 0; i < arr.length; i++) {
            arr[i] = VariableScanner.scanDouble(true);
        }

        Statistics stat = new Statistics();

        System.out.println("\nMedian is: " + stat.median(arr));
        System.out.println("\nMean is: " + stat.mean(arr) + "\n");

    }

}