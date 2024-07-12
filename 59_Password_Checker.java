class PasswordChecker {

    boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    public static void main(String args[]) {
        System.out.println("\nPassword Checker Using Do-While\n");

        String password;

        PasswordChecker p = new PasswordChecker();

        do {
            System.out.print("Enter a password: ");
            password = VariableScanner.scanString(true);
        } while (!p.isValidPassword(password));

        System.out.println("\nThanks for entering valid password\n");
    }
}