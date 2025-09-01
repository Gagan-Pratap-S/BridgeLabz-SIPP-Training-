package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;


public class HotelBooking{
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this("Default Guest", "Standard", 1);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBookingSystem h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBookingSystem b1 = new HotelBookingSystem();
        HotelBookingSystem b2 = new HotelBookingSystem("Alice", "Deluxe", 3);
        HotelBookingSystem b3 = new HotelBookingSystem(b2);
        b1.display();
        b2.display();
        b3.display();
    }
}