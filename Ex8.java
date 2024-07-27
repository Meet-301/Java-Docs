class Ex8 {
    public static void main(String args[]) {
        System.out.println("\nExercise 8\n");

        System.out.print("Enter the rows: ");
        int rows = VariableScanner.scanInt(true);

        for (int i = 0; i < rows; i++) {
            System.out.println("    ");
            for (int j = 0; j <= i; j++) {
                System.out.print("    ");
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}