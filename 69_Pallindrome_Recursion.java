class PallindromeRecursion {

    public static boolean isPallindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }

        String subStr = str.substring(1, lastPos);
        return isPallindrome(subStr);
    }

    public static void main(String args[]) {
        System.out.println("\nCheck Pallindrome String Using Recursion\n");

        String s = VariableScanner.scanString(false);

        System.out.println("\n" + s + " is " + (isPallindrome(s) ? "pallindrome\n" : "not pallindrome\n"));
    }
}