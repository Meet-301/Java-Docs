import java.util.ArrayList;

class ReverseList {

    static void swapTwoElements(ArrayList<Integer> list, int x, int y) {

        int first = list.get(x);

        list.set(x, list.get(y));
        list.set(y, first);

    }

    static void reverse(ArrayList<Integer> list) {
        // Collections.reverse(list); This is the alternate way from which you can reverse the list
        for (int i = 0; i < list.size() / 2; i++) {
            swapTwoElements(list, i, list.size() - 1 - i);
        }
        System.out.println("\nReversed list is: " + list);
    }

    public static void main(String args[]) {

        int size = 0;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Reverse the Given List");

        System.out.print("Enter list size: ");
        size = VariableScanner.scanInt(true);

        if (size <= 0) {
            System.out.println("Invalid size!!!");
        } else {

            System.out.printf("Enter %d elements: ", size);
            for (int i = 0; i < size; i++) {
                int element = VariableScanner.scanInt(true);
                list.add(element);
            }

        }

        reverse(list);

    }
}