package Day1_ProgrammingElements.Level2_practice;

import java.util.Scanner;

public class IntOperation {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();

        System.out.print("Enter integer b: ");
        int b = scanner.nextInt();

        System.out.print("Enter integer c: ");
        int c = scanner.nextInt();

        int result1 = a + b * c;   // multiplication before addition
        int result2 = a * b + c;   // multiplication before addition
        int result3 = c + a / b;   // division before addition
        int result4 = a % b + c;   // modulus before addition

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        scanner.close();
    }
}
