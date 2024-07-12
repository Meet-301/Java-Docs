class ConcatenateStringBuilder {
    public static void main(String args[]) {
        System.out.println("\nConcatenate Strings Using StringBuilder\n");

        String s1, s2;

        StringBuilder s3 = new StringBuilder();

        System.out.print("Enter String 1: ");
        s1 = VariableScanner.scanString(true);

        System.out.print("Enter String 2: ");
        s2 = VariableScanner.scanString(true);

        s3.append(s1);
        s3.append(s2);

        System.out.println("\nConcated String is: " + s3 + "\n");
    }
}