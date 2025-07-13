package Day2_controlFlows;
import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a valid positive integer less than 100.");
        } else {
            // Step 2: Use a for loop to check multiples below 100
            System.out.println("Multiples of " + number + " below 100 are:");

            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) { // Check if i is a multiple of the number
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
