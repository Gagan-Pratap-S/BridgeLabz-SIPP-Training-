
import java.util.Scanner;

public class ItemInventory {
    int itemCode;
    String itemName;
    double price;

    void displayDetails(int quantity) {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price per Item : ₹" + price);
        System.out.println("Total Cost for " + quantity + " units : ₹" + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemInventory item = new ItemInventory();

        System.out.print("Enter Item Code : ");
        item.itemCode = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Item Name : ");
        item.itemName = sc.nextLine();

        System.out.print("Enter Price : ");
        item.price = sc.nextDouble();

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        item.displayDetails(quantity);
        sc.close();
    }
}