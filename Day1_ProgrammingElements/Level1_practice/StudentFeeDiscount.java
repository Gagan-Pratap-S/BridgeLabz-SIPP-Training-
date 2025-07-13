package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Declare variables for fee and discount percentage
        double fee;
        double discountPercent;

        // Take user input for fee
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display the results
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        input.close();
    }
}
