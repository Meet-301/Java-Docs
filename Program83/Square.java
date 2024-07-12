package Program83;

import java.util.Scanner;

public class Square extends Shape {

    private float sides;
    Scanner scan = new Scanner(System.in);

    @Override
    void calculateArea() {
        
        System.out.print("Enter the sides of square: ");
        sides = scan.nextFloat();

        System.out.println("Square area is: "+(sides*sides));

    }

}
