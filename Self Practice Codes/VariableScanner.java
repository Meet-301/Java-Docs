import java.util.Scanner;

class VariableScanner {
    public static int scanInt(boolean isChange) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n;

        if (!isChange) {
            System.out.print("Enter a number: ");
            n = scan.nextInt();
        } else {
            n = scan.nextInt();
        }

        return n;
    }

    public static String scanString(boolean isChange) {
        String str;

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        if (!isChange) {
            System.out.print("Enter a value: ");
            str = scan.nextLine();
        } else {
            str = scan.nextLine();
        }
        
        return str;
    }

    public static float scanFloat(boolean isChange) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        float n;

        if (!isChange) {
            System.out.print("Enter a number: ");
            n = scan.nextFloat();
        } else {
            n = scan.nextFloat();
        }

        return n;
    }

    public static long scanLong(boolean isChange) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        long n;

        if (!isChange) {
            System.out.print("Enter a number: ");
            n = scan.nextLong();
        } else {
            n = scan.nextLong();
        }

        return n;
    }

    public static double scanDouble(boolean isChange) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        double n;

        if (!isChange) {
            System.out.print("Enter a number: ");
            n = scan.nextDouble();
        } else {
            n = scan.nextDouble();
        }

        return n;
    }
}