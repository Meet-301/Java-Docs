import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortUsingCustomComparator {

    static void sortDecending(List<String> list) {
        Collections.sort(list, new Comparator<String>() { /*
                                                           * if compare method return 1 then it
                                                           * swaps both the elements
                                                           */

            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }

        });
    }

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Bear", "Cat", "Ant");
        System.out.println(list);
        sortDecending(list);
        System.out.println(list);
    }

}