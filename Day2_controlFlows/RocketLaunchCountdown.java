package Day2_controlFlows;
import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();

        if (counter < 1) {
            System.out.println("Countdown must start from 1 or higher.");
            return;
        }

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        
        System.out.println("Launch!");
    }
}
