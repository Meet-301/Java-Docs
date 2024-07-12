class DiceRoll {

    public static int roll() {
        return (int) (Math.random() * 7);
    }

    public static void main(String args[]) {
        System.out.println("\nRoll the Dice Game\n");
        String ans;
        int roll;

        while (true) {

            roll = roll();

            System.out.print("Dice's number is: " + (roll > 0 ? roll : 1));

            System.out.println("\nWould you like to stop rolling the die? Type 'Yes' or 'No'...");
            ans = VariableScanner.scanString(true);

            if (ans.equals("Yes") || ans.equals("YES") || ans.equals("yes")) {
                break;
            }

        }

    }
}