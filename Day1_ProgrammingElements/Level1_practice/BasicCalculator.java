package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables to store the numbers
        double number1, number2;

        // Get input for number1
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        // Get input for number2
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : Double.NaN; // handle division by 0

        // Display all results in one output
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + (number2 != 0 ? division : "undefined (division by zero)"));

        // Close the scanner
        input.close();
    }
}
