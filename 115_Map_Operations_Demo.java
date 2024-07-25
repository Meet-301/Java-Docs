import java.util.List;

class MapOperationDemo {
    public static void main(String args[]) {
        System.out.println("\nMap Operation Demo\n");

        List<String> numbers = List.of("1","2","3");

        numbers.stream().forEach(Integer::parseInt);

        numbers.stream().map(null);
    }
}