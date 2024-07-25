import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class SortMethodDemo {

     class sortBySalary implements Comparator<SortMethodDemo>  {

        @Override
        public int compare(SortMethodDemo o1, SortMethodDemo o2) {
           return 0;
        }
    
        
    }

    public static void main(String args[]) {
        System.out.println("\nSort Method Demo\n");

        Map<String,Integer> map = new HashMap<>();

        map.put("Meet",78000);
        map.put("Viraj",87000);
        map.put("K.C",450000);

        
    }
}