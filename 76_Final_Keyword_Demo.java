class FinalDemo {

    final int age;
    final String name;
    final boolean isGraduated;
    String graduated;

    FinalDemo() {
        System.out.print("Enter your name: ");
        name = VariableScanner.scanString(true);
        System.out.print("Enter your age: ");
        age = VariableScanner.scanInt(true);
        System.out.print("Are you graduated? Type 'Yes' or 'No': ");
        graduated = VariableScanner.scanString(true);

        if (graduated.equals("Yes") || graduated.equals("YES") ||
                graduated.equals("yes")) {
            isGraduated = true;
        } else {
            isGraduated = false;
        }

        System.out.println("\nHi, " + name + ". Your Age is: " + age + " and You're " +
                (isGraduated ? "Graduated\n" : "Not Graduated\n"));
    }

    public static void main(String args[]) {
        System.out.println("\nDemo Code of Final Keyword\n");

        @SuppressWarnings("unused")
        FinalDemo f = new FinalDemo();
    }
}