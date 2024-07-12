class ConcatenateUpperCase {
    public static void main(String args[]) {
        String s1, s2;
        System.out.println("\nString Concatenation and Uppercase Conversion\n");

        System.out.println("Enter 2 strings");
        s1 = VariableScanner.scanString(true);
        s2 = VariableScanner.scanString(true);
        // StringBuilder sb = new StringBuilder(s1);
        // sb.append(s2);
        s1 += s2;

        System.out.printf("\nCombined String is %S\n\n", s1);
    }
}