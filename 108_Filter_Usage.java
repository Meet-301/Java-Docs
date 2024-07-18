import java.util.Arrays;
import java.util.List;

class FilterUsage {
    public static void main(String args[]) {
        System.out.println("\nFilter Usage\n");

        List<String> list = Arrays.asList("ten_length_string","notTen","_notTen2");
        StringBuilder sb = new StringBuilder();
        
        list.stream().filter(s -> s.length() > 10).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.length() <= 10).forEach(s -> sb.append(s));
        System.out.println("New Concatenated String is: "+sb);
    }
}