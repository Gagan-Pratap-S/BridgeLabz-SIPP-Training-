package Week2_Day1_ClassAndObject.level2practice;
import java.util.Scanner;

public class MovieTicketSystem {
    String movieName;
    String seatNumber;
    double price;

    public void bookTicket(String movie, String seat, double p) {
        movieName = movie;
        seatNumber = seat;
        price = p;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicketSystem ticket = new MovieTicketSystem();
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();
        System.out.print("Enter seat number: ");
        String seat = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        ticket.bookTicket(movie, seat, price);
        ticket.displayTicket();
        sc.close();
    }
}