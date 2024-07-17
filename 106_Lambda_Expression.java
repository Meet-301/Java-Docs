import java.util.function.BinaryOperator;

class LambdaTrial {
    public static void main(String args[]) {
        BinaryOperator<Integer> multiply = (n1, n2) -> n1 * n2; 
        System.out.println(multiply.apply(2, 3));
    }
}