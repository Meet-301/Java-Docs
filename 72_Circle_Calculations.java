class CircleCalculations {
    public static void main(String args[]) {
        System.out.println("\nCalculation of Area and Circumference of a Circle\n");

        System.out.print("\nEnter radius of a circle: ");
        double r = VariableScanner.scanDouble(true);

        if (r <= 0) {
            System.out.println("\nInvalid radius entered!!!\n");
        } else {
            System.out.print("\nCircumference is " + (2 * Math.PI * r) + " and Area is " +
                    (Math.PI * r * r) + "\n\n");
        }

    }
}