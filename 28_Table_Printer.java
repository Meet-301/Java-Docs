import java.util.Scanner;

class test16 {
    public static void main(String args[]) {
        multiply(scan());
    }

    public static void multiply(int num) {
        int i=1;
        System.out.println("\n"+num+"'s table\n");
        while (i<=10) {
            System.out.println(num+" * "+i+" = "+(num*i));
            i++;
        }
        System.out.println();
    }

    public static int scan() {
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        return n;
    }
}