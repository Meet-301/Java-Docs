import java.util.Scanner;

class test15 {
    /**
     * This is main method which is entry point of any code
     * 
     * @param args
     */
    // Above is the example of document comment which is used to specify
    // description about any method... means if we use it at above of any particular
    // method then
    // it
    // shows the message which is written inside that comment when we hover that
    // mentioned method
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Odd even number checker using bitwise operators\n");

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if ((n & 1) == 1) {
            System.out.println("\n" + n + " is odd number\n");
        } else {
            System.out.println("\n" + n + " is even number\n");
        }

        sc.close();
    }
}