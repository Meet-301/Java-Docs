class NumberGuessGame {

    static int random;

    NumberGuessGame() {
        random = (int) (Math.ceil(Math.random() * 100));
    }

    public static void main(String args[]) {

        System.out.println("\nGuess The Number Game");

        int guess = 0;

        @SuppressWarnings("unused")
        NumberGuessGame n = new NumberGuessGame();

        System.out.println();

        while (guess != random) {

            System.out.print("Guess the number: ");
            guess = VariableScanner.scanInt(true);

            if (guess > 100 || guess <= 0) {
                System.out.println("Please guess the number between 1 to 100\n");
            } else {
                if (guess > random) {
                    System.out.println("Your guessed number is greater than my guessed number!!!\n");
                } else if (guess < random) {
                    System.out.println("Your guessed number is less than my guessed number!!!\n");
                } else if (guess == random) {
                    System.out.println("Yeah!! You've guesesd the right number successfully!!!\n");
                }
            }

        }

    }
}