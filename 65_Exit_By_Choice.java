class ExitByChoice {
    public static void main(String args[]) {
        @SuppressWarnings("unused")
        int choice, i;
        System.out.println("\nExit By Choice\n");

        System.out.println("What would you like to enter?\n");
        System.out.println("1.String(Words)");
        System.out.println("2.Integer(A Small Number Without Point)");
        System.out.println("3.Long(A Large Number Without Point)");
        System.out.println("4.Float(A Small Number With Point)");
        System.out.println("5.Double(A Large Number With Point)\n");
        System.out.print("Enter your choice: ");
        choice = VariableScanner.scanInt(true);

        switch (choice) {
            case 1 -> System.out.println("\nWrite Exit If You Want to Stop the Program\n");
            case 2 -> System.out.println("\nWrite 0 If You Want to Stop the Program\n");
            case 3 -> System.out.println("\nWrite 0 If You Want to Stop the Program\n");
            case 4 -> System.out.println("\nWrite 0 If You Want to Stop the Program\n");
            case 5 -> System.out.println("\nWrite 0 If You Want to Stop the Program\n");
        }

        if (choice == 1) {
            for (i = 0; true; i++) {
                String val;
                val = VariableScanner.scanString(false);
                if (val.equals("Exit") || val.equals("exit")) {
                    break;
                }
            }
            System.out.println("\nYou've exited successfully!!\n");
        } else if (choice == 2) {
            for (i = 0; true; i++) {
                int n;
                n = VariableScanner.scanInt(false);
                if (n == 0) {
                    break;
                }
            }
            System.out.println("\nYou've exited successfully!!\n");
        } else if (choice == 3) {
            for (i = 0; true; i++) {
                long n;
                n = VariableScanner.scanLong(false);
                if (n == 0) {
                    break;
                }
            }
            System.out.println("\nYou've exited successfully!!\n");
        } else if (choice == 4) {
            for (i = 0; true; i++) {
                float n;
                n = VariableScanner.scanFloat(false);
                if (n == 0) {
                    break;
                }
            }
            System.out.println("\nYou've exited successfully!!\n");
        } else if (choice == 5) {
            for (i = 0; true; i++) {
                double n;
                n = VariableScanner.scanDouble(false);
                if (n == 0) {
                    break;
                }
            }
            System.out.println("\nYou've exited successfully!!\n");
        }
    }
}