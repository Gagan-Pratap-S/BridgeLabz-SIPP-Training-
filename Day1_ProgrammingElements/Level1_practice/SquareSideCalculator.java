package Day1_ProgrammingElements.Level1_practice;
import java.util.*;
public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare a variable to store the perimeter
        double perimeter;

        // user to enter the perimeter
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}