import java.util.Scanner;

class test42 {
    public static void main(String args[]) {
        System.out.println("\nStudent Grade Checker Using Ternary Operator\n");

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int marks;
        String grade;

        System.out.print("Enter your marks: ");
        marks = scan.nextInt();

        grade = marks > 80 ? "High" : (marks < 50 ? "Low" : "Moderate");

        System.out.println("\nYour grade is: " + grade + "\n");
    }
}