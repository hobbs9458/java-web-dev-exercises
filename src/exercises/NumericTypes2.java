package exercises;

import java.util.Scanner;

public class NumericTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double miles = input.nextDouble();
        System.out.println("How much gas did you consume: ");
        double gasConsumed = input.nextDouble();
        double milesPerGallon = miles / gasConsumed;
        System.out.println("Your car gets " + milesPerGallon + " miles per gallon.");
    }
}
