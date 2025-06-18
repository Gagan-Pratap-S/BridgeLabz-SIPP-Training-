package Day2_controlFlows;
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int greatestFactor = 1; 
        int counter = number - 1; 

        //  Use a while loop to find the greatest factor
        while (counter > 0) {
            if (number % counter == 0) {
                greatestFactor = counter; // Assign the counter to greatestFactor
                break; // Exit the loop once the greatest factor is found
            }
            counter--; // Decrease counter in each iteration
        }

      
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        scanner.close();
    }
}
