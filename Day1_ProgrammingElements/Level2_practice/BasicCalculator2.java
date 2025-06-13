package Day1_ProgrammingElements.Level2_practice;

import java.util.Scanner;

public class BasicCalculator2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1, number2;

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : Double.NaN;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                number1 + " and " + number2 + " is " +
                addition + ", " + subtraction + ", " + multiplication + ", and " +
                (number2 != 0 ? division : "undefined (division by zero)"));

        input.close();
    }
}
