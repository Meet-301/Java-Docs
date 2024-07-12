import java.util.ArrayList;
import java.util.Collections;

class SwapUsingArrayList {

    static void swapTwoElements(ArrayList<Integer> list, int x, int y) {

        int first = list.get(x);

        System.out.println("Before Swapping");
        System.out.printf("First = %d , Second = %d\n", list.get(x), list.get(y));

        list.set(x, list.get(y));
        list.set(y, first);

        System.out.println("\nAfter Swapping");
        System.out.printf("First = %d , Second = %d\n\n", list.get(x), list.get(y));

    }

    public static void main(String args[]) {

        System.out.println("\nSwap Elements Using Array List\n");

        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 101, 2456, 301, 403);

        swapTwoElements(list, 1, 2);

    }
}