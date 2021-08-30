package exercises;
import java.util.Scanner;

public class numericTypes {
    public static void main(String[] args) {
        double milesDriven;
        double gasConsumed;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        milesDriven = input.nextDouble();
        System.out.println("Enter the amount of gas consumed in gallons: ");
        gasConsumed = input.nextDouble();
        input.close();

        milesPerGallon = milesDriven / gasConsumed;
        System.out.println("Your MPG is: " + milesPerGallon + "MPG");
    }
}
