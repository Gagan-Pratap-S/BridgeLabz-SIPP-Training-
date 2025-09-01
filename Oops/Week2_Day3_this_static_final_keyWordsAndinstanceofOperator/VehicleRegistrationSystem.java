package Week2_Day3_this_static_final_keyWordsAndinstanceofOperator;


public class VehicleRegistrationSystem {
    static int registrationFee = 5000;
    final String registrationNumber;
    String ownerName, vehicleType;

    public VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void display() {
        if (this instanceof VehicleRegistrationSystem) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        VehicleRegistrationSystem v1 = new VehicleRegistrationSystem("Sana", "Car", "MH1234");
        v1.display();
        updateRegistrationFee(6000);
        v1.display();
    }
}
