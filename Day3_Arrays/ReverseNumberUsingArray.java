package Day3_Arrays;
import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;

        // Count number of digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        //  Create reverse array
        int[] reverseArray = new int[count];
        for (int i = 0; i < count; i++) {
            reverseArray[i] = digits[count - 1 - i];
        }

        //  Display reversed array 
        System.out.print("Reversed digits of " + originalNumber + " are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
