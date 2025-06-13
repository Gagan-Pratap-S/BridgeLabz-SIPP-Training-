package Day1_ProgrammingElements.Level1_practice;

import java.util.Scanner;

public class HandshakeCalculator {
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declare variable for number of students
    int numberOfStudents;

    // Prompt user to enter number of students
    System.out.print("Enter the number of students: ");
    numberOfStudents = input.nextInt();

    // Calculate maximum number of handshakes using combination formula
    int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

    // Display the result
    System.out.println("The maximum number of possible handshakes is " + handshakes);

    // Close the scanner
    input.close();
}
}