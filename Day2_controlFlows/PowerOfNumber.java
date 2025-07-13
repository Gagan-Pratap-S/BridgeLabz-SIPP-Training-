package Day2_controlFlows;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        int result = 1;

        // Use a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply result by the base number in each iteration
        }

        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
