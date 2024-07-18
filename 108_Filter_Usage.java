import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FilterUsage {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        System.out.println("\nFilter Usage\n");

        List<String> list = Arrays.asList("ten_length_string","notTen");
        List<String> newList = new ArrayList<>();
        
        list.stream().filter(s -> s.length() > 10).forEach(s -> System.out.println(s));
    }
}