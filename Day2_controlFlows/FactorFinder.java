package Day2_controlFlows;
import java.util.Scanner;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Get input and check if it's a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            //  Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) { // Check if i is a factor
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
