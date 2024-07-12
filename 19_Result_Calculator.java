import java.util.Scanner;

class test12 {
    public static void main(String args[]) {
        int c,cpp,java,python,dotnet,sum;
        float result;
        String status="Pass";
        Scanner sc = new Scanner(System.in);
        System.out.println("Result Calculator");

        System.out.print("Enter your c marks: ");
        c = sc.nextInt();
        System.out.print("Enter your cpp marks: ");
        cpp = sc.nextInt();
        System.out.print("Enter your java marks: ");
        java = sc.nextInt();
        System.out.print("Enter your python marks: ");
        python = sc.nextInt();
        System.out.print("Enter your dotnet marks: ");
        dotnet = sc.nextInt();

        sum = c+cpp+java+python+dotnet;
        result = sum*100/500;

       
        if (result > 90) {
            System.out.println("Your status is: "+status);
            System.out.println("Your total is: "+sum);
            System.out.println("Your percentage is: "+result+"%");
            System.out.println("Your grade is A");
            System.out.println("Sabash beta sabash! lallntop result laye ho tum to!");
        }
        else if (result > 75) {
            System.out.println("Your status is: "+status);
            System.out.println("Your total is: "+sum);
            System.out.println("Your percentage is: "+result+"%");
            System.out.println("Your grade is B");
            System.out.println("Acche number hai taiyari aur tagdi chahiye!!");
        }
        else if (result > 60) {
            System.out.println("Your status is: "+status);
            System.out.println("Your total is: "+sum);
            System.out.println("Your percentage is: "+result+"%");
            System.out.println("Your grade is C");
            System.out.println("Intermediate ho dost thodi jyada try karo!!!");
        }
        else if (result > 35) {
            System.out.println("Your status is: "+status);
            System.out.println("Your total is: "+sum);
            System.out.println("Your percentage is: "+result+"%");
            System.out.println("Your grade is D");
            System.out.println("Bohot jyada mehnat karni padegi tujhe");
        }
        else if (result<35) {
            status = "Fail";
            System.out.println("Your status is: "+status);
            System.out.println("Your total is: "+sum);
            System.out.println("Your percentage is: "+result+"%");
            System.out.println("Your grade is F");
            System.out.println("Rehne do beta tumse na ho payega!!!!!");
        }

        sc.close();
    }
}