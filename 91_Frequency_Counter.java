import java.util.ArrayList;
import java.util.Collections;

class FrequencyCounter {
    public static void main(String args[]) {
        System.out.println("Frequency Counter");
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,1,2,3,4);
        System.out.println(Collections.frequency(list, 1));
    }
}