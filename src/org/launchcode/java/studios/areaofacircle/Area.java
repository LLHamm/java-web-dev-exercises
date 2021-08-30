package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import static java.lang.Double.isNaN;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        if (isNaN(radius)) {
            System.out.println("Please enter a valid number: ");
            radius = input.nextDouble();
        }
        input.close();

        /* area = Math.PI * (radius * radius); */
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
