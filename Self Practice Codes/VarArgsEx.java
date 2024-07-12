public class VarArgsEx {

    static double add(double... a) {
        double sum = 0;

        for (double d : a) {
            sum += d;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2, 3, 4, 5));
    }

}