package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Declare a variable to store height in cm
        double heightCm;

        // Prompt user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Convert cm to inches: 1 inch = 2.54 cm
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12); // whole feet
        double inches = totalInches % 12;    // remaining inches

        // Display the result
        System.out.println(
            "Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches
        );

        // Close the scanner
        input.close();
    }
}
