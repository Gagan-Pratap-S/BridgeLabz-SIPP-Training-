package Day1_ProgrammingElements.Level1_practice;

public class SamAverageMark {
    public static void main(String[] args) {
        // Declare and initialize marks in each subject
        int maths = 94;        // Marks in Mathematics
        int physics = 95;      // Marks in Physics
        int chemistry = 96;    // Marks in Chemistry

        // Calculate total marks
        int totalMarks = maths + physics + chemistry;

        // Total number of subjects
        int numberOfSubjects = 3;

        // Calculate average marks
        double average = totalMarks / numberOfSubjects;

        // Display the result
        System.out.println("Sam's average mark in PCM is " + average);
    }
}
