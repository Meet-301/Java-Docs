class MuliplicationTable {
    void tableGenerator(int n) {
        System.out.println("\n" + n + "'s Table\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + (n * i));
        }
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("\nMultiplication Table Genearator Using For Loop\n");

        int num = VariableScanner.scanInt(false);

        MuliplicationTable m = new MuliplicationTable();
        m.tableGenerator(num);
    }
}