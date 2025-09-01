package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;



public class ProductInventory {
    String productName;
    double price;
    static int totalProducts;

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 50000);
        ProductInventory p2 = new ProductInventory("Mouse", 500);
        p1.displayProductDetails();
        p2.displayProductDetails();
        displayTotalProducts();
    }
}