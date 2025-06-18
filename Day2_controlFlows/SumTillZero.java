package Day2_controlFlows;
import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;         // Initialize total
        double number;              // Variable to store user input

        //  Use while loop
        System.out.print("Enter a number (0 to stop): ");
        number = scanner.nextDouble();

        while (number != 0.0) {
            //  Add to total and ask for next input
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
        }

        // Display the total
        System.out.println("Total sum: " + total);

        scanner.close();
    }
}

