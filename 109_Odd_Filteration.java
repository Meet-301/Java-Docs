import java.util.List;

class OddFilteration {
    public static void main(String args[]) {
        System.out.println("\nOdd Filteration\n");

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().filter(s -> {
            if (s % 2 != 0) {
                return true;
            } else {
                return false;
            }
        });
    }
}