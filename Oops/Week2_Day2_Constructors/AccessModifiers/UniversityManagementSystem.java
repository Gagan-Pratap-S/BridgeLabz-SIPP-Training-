package Week2_Day2_Constructors.AccessModifiers;


import java.util.Scanner;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

public class UniversityManagementSystem extends Student {
    public UniversityManagementSystem(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        UniversityManagementSystem s = new UniversityManagementSystem(roll, name, cgpa);
        s.display();

        System.out.print("Enter new CGPA to update: ");
        cgpa = sc.nextDouble();
        s.setCGPA(cgpa);
        s.display();
        sc.close();
    }
}