import java.util.Scanner;

class test32 {
    public static void main(String args[]) {
        System.out.println("\nDelete a Specific Element From Given Elements\n");

        int[] arr = ArrayUtility.inputArray();

        if (arr.length < 1) {
            System.out.println("\nPlease enter a valid size!!!\n");
        } else {
            delete(arr);
        }

    }

    public static void delete(int[] a) {
        int i = 0, e, j = 0, flag = 0;
        int a2[] = new int[a.length - 1];

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter an element you want to delete: ");
        e = scan.nextInt();

        if (a.length == 1 && a[0] == e) {
            System.out.println("\n" + e + " deleted successfully\n");
            System.out.println("Block is now empty!!\n");
        }

        else {
            while (i < a.length) {
                if (e == a[i]) {
                    flag = 1;
                    break;
                }
                i++;
            }

            if (flag == 0) {
                System.out.println("\n" + e + " isn't available in the block!!!\n");
            } else {

                i = 0;
                while (i < a.length) {

                    if (a[i] != e) {
                        a2[j] = a[i];
                        j++;
                    }
                    i++;
                }

                System.out.println("\n" + e + " deleted successfully\n");
                System.out.println("New Block is ");

                j = 0;
                while (j < a2.length) {
                    System.out.println(a2[j]);
                    j++;
                }
                System.out.println();
            }
        }
    }

}