package com.example.utils;
import java.util.Scanner;
import com.example.geometry.*;

public class Calculate {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle rect = new Rectangle();

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter Circle's Radius: ");
        c.r = scan.nextDouble();

        System.out.print("\nCircle's Area is: " + (Math.PI * c.r * c.r) + "\n");

        System.out.println("\nNow Enter Rectangle Parameteres to Calculate it's Area...\n");

        System.out.print("Enter length: ");
        rect.l = scan.nextDouble();
        System.out.print("Enter width: ");
        rect.w = scan.nextDouble();

        System.out.println("\nRectangle's Area is: "+(rect.l*rect.w)+"\n");
    }
}