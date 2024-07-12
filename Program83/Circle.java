package Program83;

import java.util.Scanner;

public class Circle extends Shape {

    private float radius;
    Scanner scan = new Scanner(System.in);

    @Override
    void calculateArea() {

        System.out.print("Enter radius: ");
        radius = scan.nextFloat();

        System.out.println("Area of circle is: "+(Math.PI*radius*radius));
    }

}
