import java.util.HashSet;
import java.util.Set;

class UniqueCharacters {
    public static void main(String args[]) {

        System.out.println("\nGet the Unique Characters of SET\n");

        System.out.print("Enter a string: ");
        String s = VariableScanner.scanString(true);

        Set<Character> set = new HashSet<>();

        for (Character character : s.toCharArray()) {
            set.add(character);
        }

        System.out.printf("There are %d unique characters in the SET\n\n", set.size());

    }
}