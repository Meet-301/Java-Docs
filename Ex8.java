class Ex8 {
    public static void main(String args[]) {
        System.out.println("\nExercise 8\n");

        System.out.print("Enter array size: ");
        int size = VariableScanner.scanInt(true);

        int n[] = new int[size];
        int odd = 0, even = 0;

        System.out.println("Enter " + size + " elements");
        for (int i = 0; i < n.length; i++) {
            n[i] = VariableScanner.scanInt(true);
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.printf("\nOdd Numbers: %d, Even Numebers: %d", odd, even);
    }
}