import java.util.Scanner;
public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 10;
        int occupancy = 0;
        int choice;

        while(true){
            System.out.println("Menu");
            System.out.println("1: Park");
            System.out.println("2: Exit");
            System.out.println("3: Show Occupancy");
            System.out.println("4: Quit");
            System.out.println("Enter your choice");
            choice=scanner.nextInt();

            switch (choice) {
                case 1: // park car
                 if(occupancy < capacity){
                     occupancy++;
                      System.out.println("Car parked, capacity left : "+ (capacity-occupancy));
                    }
                    else{
                     System.out.println("parking is Full...");
                 }
                    break;

                case 2: // Exit car
                if(occupancy > 0){
                    occupancy--;
                    System.out.println("car Exited. Spot Availaible: "+(capacity-occupancy));
                }
                else{
                    System.out.println("Park lot is already empty..");
                }
                break;

                case 3: // Show Occupancy
                System.out.println("current Occupancy: "+ occupancy);
                break;

                case 4: // Quit the parking lot system  
                System.out.println("Exiting the system...");
                scanner.close();
                return;

                default:
                System.out.println("invalid choice..");
                    break;
            }
            if (occupancy == capacity){
                System.out.println("Parking Lot is full.");
            }
        }
        }
        
    }

