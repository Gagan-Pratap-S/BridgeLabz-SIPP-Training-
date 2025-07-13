package Day3_Arrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;

        //  Find digits and save in an array
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        //  Frequency array of size 10
        int[] frequency = new int[10];  // index 0 to 9 represents digits

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        //  Display the frequency of each digit
        System.out.println("\nDigit frequencies in number " + originalNumber + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}
