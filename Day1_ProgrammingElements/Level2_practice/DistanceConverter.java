package Day1_ProgrammingElements.Level2_practice;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceFeet;

        System.out.print("Enter the distance in feet: ");
        distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;

        System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);

        input.close();
    }
}
