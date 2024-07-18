import java.util.List;

class OddFilteration {
    public static void main(String args[]) {
        System.out.println("\nOdd Filteration\n");

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println("Odd numbers are: " + n));
    }
}