package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;

public class CarRentalSystem {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void display() {
        double cost = rentalDays * 1000.0;
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Cost: " + cost);
    }

    public static void main(String[] args) {
        CarRentalSystem rental = new CarRentalSystem("Bob", "Swift", 5);
        rental.display();
    }
}