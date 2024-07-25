import java.util.List;

class MapOperationDemo {
    public static void main(String args[]) {
        System.out.println("\nMap Operation Demo\n");

        List<String> numbers = List.of("1","2","3");

        numbers.stream().map(Integer::parseInt).map(num -> Math.pow(num, 2)).forEach(System.out::println);
    }
}