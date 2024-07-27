class Ex8 {
    public static void main(String args[]) {
        System.out.println("\nExercise 8\n");

        System.out.print("Enter array size: ");
        int size = VariableScanner.scanInt(true);

        int n[] = new int[size];

        System.out.println("Enter "+size+" elements");
        for (int i = 0; i < n.length; i++) {
            n[i] = VariableScanner.scanInt(true);
        }
    }
}