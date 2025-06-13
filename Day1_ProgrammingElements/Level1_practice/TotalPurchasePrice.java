package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for unit price and quantity
        double unitPrice;
        int quantity;

        // Prompt user to enter unit price
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        // Prompt user to enter quantity
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // Close the scanner
        input.close();
    }
}
