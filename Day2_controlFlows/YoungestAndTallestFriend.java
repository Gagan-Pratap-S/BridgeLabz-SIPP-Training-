package Day2_controlFlows;
import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details for Amar:");

        System.out.print("Age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Height of Amar (in cm): ");
        int amarHeight = scanner.nextInt();

        System.out.println("\nEnter the details for Akbar:");

        System.out.print("Age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Height of Akbar (in cm): ");
        int akbarHeight = scanner.nextInt();

        System.out.println("\nEnter the details for Anthony:");

        System.out.print("Age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Height of Anthony (in cm): ");
        int anthonyHeight = scanner.nextInt();

        // Step 2: Find the youngest friend based on age
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Step 3: Find the tallest friend based on height
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Step 4: Display the results
        System.out.println("\nThe youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        scanner.close();
    }
}
