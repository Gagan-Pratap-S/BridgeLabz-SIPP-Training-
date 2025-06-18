package Day2_controlFlows;
import java.util.Scanner;
public class GreatestFactorLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int greatestFactor = 1; 

        //  Create a for loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if number is divisible by i
                greatestFactor = i; // Assign i to greatestFactor
                break; // Exit the loop once the greatest factor is found
            }
        }

     
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

        scanner.close();
    }
}
