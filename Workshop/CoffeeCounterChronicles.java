
import java.util.Scanner;
public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        double GST_RATE = 0.05; 
        int price= 0;
        int quantity = 0;
        int customer=0;

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter customer number: ");
        //customer = scanner.nextInt();
        System.out.println("enter coffee type : ");
        String coffeeType = scanner.nextLine();   

        if (coffeeType.equalsIgnoreCase("Espresso")) {
            price = 3;
        } else if (coffeeType.equalsIgnoreCase("Cappuccino")){
            price = 4;
        } else if (coffeeType.equalsIgnoreCase("Latte")) {
            price = 4;
        } else {
            System.out.println("Invalid coffee type. Please try again.");
            scanner.close();
            return; 
        }
        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();
        double totalBill = price * quantity;
        double gstAmount = totalBill * GST_RATE;
        double Total = totalBill + gstAmount;
        System.out.println("Total Bill:" + Total);
        
        
    }
}
