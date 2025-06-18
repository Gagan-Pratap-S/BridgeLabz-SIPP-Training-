package Day3_Arrays;
import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of 5 integers
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + ": ");

            if (num > 0) {
                System.out.print("Positive and ");
                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\n--- Comparison of First and Last Elements ---");
        if (first == last) {
            System.out.println("First and last numbers are equal.");
        } else if (first > last) {
            System.out.println("First number is greater than the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        scanner.close();
    }
}
