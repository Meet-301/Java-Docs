class VarArgsConcatenation {

    static String concatenateStrings(String... str) {
        StringBuilder sb = new StringBuilder();

        for (String string : str) {
            sb.append(string);
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        System.out.println("\nValues Combiner\n");
        System.out.println(concatenateStrings("M", "e", "e", "t") + "\n");
    }
}