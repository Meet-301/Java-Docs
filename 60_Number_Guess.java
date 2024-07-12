class GuessNumber {

    boolean numberValidator(double n) {
        double number = 9;
        return number == n;
    }

    public static void main(String args[]) {
        System.out.println("\nGuess The Number Game\n");

        double num;

        GuessNumber g = new GuessNumber();

        do {
            num = VariableScanner.scanDouble(false);
        } while (!g.numberValidator(num));

        System.out.println("\nCongratulations!! You've guessed a right number\n");

    }
}