package Day2_controlFlows;
import java.util.Scanner;
public class OddEvenNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Get integer input and check for a natural number
        System.out.print("Enter a natural number (positive integer): ");
        int number = scanner.nextInt();

        // check for natural no.
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            //  Iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                //  Check if even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        scanner.close();
    }
}
