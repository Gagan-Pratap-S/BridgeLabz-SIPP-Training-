package Day3_Arrays;
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a double array of size 11
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add height to the sum
        }

        //  Calculate the mean
        double mean = sum / heights.length;

        System.out.printf("\nMean height of the football players is: %.2f\n", mean);

        scanner.close();
    }
}
