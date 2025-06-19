package Day3_Arrays;
import java.util.Scanner;

public class LargestDigitsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // : Define array for digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // : Index for array
        int index = 0;

        // : Extract digits and store in array
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;
            number /= 10;

            if (index == maxDigit) {
                break;
            }
        }

        // Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

    
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
