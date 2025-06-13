package Day1_ProgrammingElements.Level2_practice;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + dividend + " and " + divisor);

        scanner.close();
    }
}
