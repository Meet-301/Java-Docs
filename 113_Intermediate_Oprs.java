import java.util.List;
import java.util.stream.Collectors;

class IntermediateOperations {
    public static void main(String args[]) {
        System.out.println("\nIntermediate Operations\n");

        List<Integer> list = List.of(1,2,3);

        List<Integer> newList;

        newList = list.stream().distinct().collect(Collectors.toList());

        newList.forEach(System.out::println);
    }
}