package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable to store distance in feet
        double distanceInFeet;

        // Prompt user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Convert feet to yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display the result
        System.out.println("The distance in feet is " + distanceInFeet +
                           ", in yards is " + distanceInYards +
                           ", and in miles is " + distanceInMiles);

        // Close the scanner
        input.close();
    }
}
