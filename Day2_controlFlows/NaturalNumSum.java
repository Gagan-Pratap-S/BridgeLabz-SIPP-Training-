package Day2_controlFlows;
import java.util.Scanner;
public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        // Check if it's a natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer. Natural numbers start from 1.");
        } else {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print both results and compare
            System.out.println("Sum using for loop: " + loopSum);
            System.out.println("Sum using formula (n*(n+1)/2): " + formulaSum);

            // Comparison result
            if (loopSum == formulaSum) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a mismatch between the results.");
            }
        }

        scanner.close();
    }
}
