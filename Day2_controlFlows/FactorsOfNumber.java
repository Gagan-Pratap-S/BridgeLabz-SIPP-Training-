package Day2_controlFlows;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a valid positive integer.");
        } else {
            //  Use a while loop to find and print the factors
            int counter = 1;

            System.out.println("Factors of " + number + " are:");
            while (counter <= number) {
                if (number % counter == 0) { // Check if counter is a factor of the number
                    System.out.println(counter); 
                }
                counter++; 
            }
        }

        scanner.close();
    }
}
