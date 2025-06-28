import java.util.Scanner;

public class VotingBoothManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Candidate1Votes = 0;
        int Candidate2Votes = 0;
        int voters = 1;            
        System.out.println("Enter the no. of voters:");
        voters = scanner.nextInt();

        while (voters != 0) {
            
            System.out.println("Enter the age of the voter:");
            int age = scanner.nextInt();

            if (age < 18) {
            System.out.println("You are not eligible to vote.");
            } else {
            System.out.println("Choose your candidate: 1 or 2");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Candidate1Votes++;
            } else if (choice == 2) {
                Candidate2Votes++;
            } else {
                System.out.println("Invalid choice. Please choose either 1 or 2.");
            }
            voters--;
            }if (voters == 0) {
                break;
                }
        }

            System.out.println("Votes for candidate 1: " + Candidate1Votes);
            System.out.println("Votes for candidate 2: " + Candidate2Votes);
        
        scanner.close();
    }
}
