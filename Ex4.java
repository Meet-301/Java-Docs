import java.util.Scanner;

class Ex4 {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        System.out.println("\nExercise 4\n");

        Scanner scan = new Scanner(System.in);
        String s = null;
        int others = 0, spaces = 0, letters = 0, numbers = 0;

        System.out.print("Enter a string: ");
        s = scan.nextLine();

        char[] c = s.toCharArray();

        for (int c2 = 0; c2 < c.length; c2++) {
            if (Character.isLetter(c[c2])) {
                letters++;
            }
            else if (Character.isWhitespace(c[c2])) {
                spaces++;
            }
            else if (Character.isDigit(c[c2])) {
                numbers++;
            }
            else {
                others++;
            }
        }
    }
}