package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class KmToMilesUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare a variable to store kilometers
        double km;

        // Prompt the user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();  // Read the distance input by the user

        // 1 mile = 1.6 kilometers, so:
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close the scanner
        input.close();
    }
}
