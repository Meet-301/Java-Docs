class Student {

    String name;
    int age;

    Student() {
        System.out.print("Enter Student's Name: ");
        name = VariableScanner.scanString(true);
        System.out.print("Enter Student's Age: ");
        age = VariableScanner.scanInt(true);
    }

    @Override
    public String toString() {
        return "\nStudent's Name is: " + name + " and Age is: " + age + "\n";
    }

    public static void main(String args[]) {
        System.out.println("\nStudent Details Printer\n");

        Student st = new Student();
        System.out.println(st);
    }

}