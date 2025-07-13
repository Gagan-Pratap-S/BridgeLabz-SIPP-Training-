package Day3_Arrays;
import java.util.Scanner;
public class StoreAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers. Enter 0 or a negative number to stop:");

        //Infinite loop to take user input
        while (true) {
            double input = scanner.nextDouble();

            //Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            //  Store number if within array limit
            numbers[index] = input;
            index++;

            // Break if array is full
            if (index == 10) {
                break;
            }
        }

        //  Calculate total
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }

        System.out.printf("\nTotal of entered numbers: %.2f\n", total);

        scanner.close();
    }
}
