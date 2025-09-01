package Week2_Day3_this_static_final_keyWordsAndinstanceofOperator;



public class ShoppingCartSystem {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public ShoppingCartSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {
        if (this instanceof ShoppingCartSystem) {
            System.out.println("ID: " + productID + ", Name: " + productName + ", Price: " + price + ", Qty: " + quantity + ", Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        ShoppingCartSystem p1 = new ShoppingCartSystem(1, "Pen", 10.0, 5);
        ShoppingCartSystem p2 = new ShoppingCartSystem(2, "Notebook", 50.0, 2);
        p1.display();
        p2.display();
        updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");
    }
}