package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of your circle: ");

        double radius = input.nextDouble();

        Double area = Circle.getArea(radius);

        System.out.println("The area of the circle is: " + area);
    }
}
