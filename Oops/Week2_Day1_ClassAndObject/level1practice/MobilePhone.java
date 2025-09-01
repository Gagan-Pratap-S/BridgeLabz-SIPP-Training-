

import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();

        System.out.print("Enter Brand : ");
        phone.brand = sc.nextLine();

        System.out.print("Enter Model : ");
        phone.model = sc.nextLine();

        System.out.print("Enter Price : ");
        phone.price = sc.nextDouble();

        phone.displayDetails();
        sc.close();
    }
}