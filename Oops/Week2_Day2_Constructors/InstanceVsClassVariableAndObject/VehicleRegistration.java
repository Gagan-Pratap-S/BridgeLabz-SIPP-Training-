package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;


public class VehicleRegistration {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        VehicleRegistration v1 = new VehicleRegistration("Arjun", "Car");
        VehicleRegistration v2 = new VehicleRegistration("Meera", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        updateRegistrationFee(6000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}