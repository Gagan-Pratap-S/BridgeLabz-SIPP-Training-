package Day1_ProgrammingElements.Level2_practice;

import java.util.Scanner;

public class DoubleOprations {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter double value a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter double value b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter double value c: ");
        double c = scanner.nextDouble();

        double result1 = a + b * c;   // multiplication before addition
        double result2 = a * b + c;   // multiplication before addition
        double result3 = c + a / b;   // division before addition
        double result4 = a % b + c;   // modulus before addition

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        scanner.close();
    }
}
