package Week2_Day1_ClassAndObject.level2practice;
import java.util.Scanner;

public class StudentReport {
    String name;
    int rollNumber;
    int marks;

    public void calculateGrade() {
        char grade = (marks >= 90) ? 'A' : (marks >= 75) ? 'B' : (marks >= 50) ? 'C' : 'D';
        System.out.println("Grade: " + grade);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        calculateGrade();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentReport student = new StudentReport();
        System.out.print("Enter name: ");
        student.name = sc.nextLine();
        System.out.print("Enter roll number: ");
        student.rollNumber = sc.nextInt();
        System.out.print("Enter marks: ");
        student.marks = sc.nextInt();
        student.display();
        sc.close();
    }
}