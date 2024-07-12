class Overloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double x, double y) {
        return x + y;
    }

    public static void main(String args[]) {
        System.out.println("Sum of 2 integers(5,4) is: " + add(5, 4));
        System.out.println("Sum of 3 integers(5,4,2) is: " + add(5, 4, 2));
        System.out.println("Sum of 2 doubles(5.4,4.3) is: " + add(5.4, 4.3));
    }
}