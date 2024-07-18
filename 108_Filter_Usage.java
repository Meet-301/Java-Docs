import java.util.List;

class FilterUsage {
    public static void main(String args[]) {
        System.out.println("\nFilter Usage\n");

        List<String> list = List.of("ten_length_string", "notTen", "_notTen2");

        String filtered = list.stream().filter(s -> s.length() >= 10).reduce("", (a, b) -> a + " " + b);

        System.out.println("Filtered String is: " + filtered);
    }
}