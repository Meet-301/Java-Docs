import java.util.Scanner;

class test13 {
    public static void main(String args[]) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("The Age Categorizer\n");

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age < 13) {
            System.out.println("You're child");
        } else if (age < 20) {
            System.out.println("You're teen");
        } else if (age < 60) {
            System.out.println("You're adult");
        } else {
            System.out.println("You're senior");
        }

        sc.close();
    }
}