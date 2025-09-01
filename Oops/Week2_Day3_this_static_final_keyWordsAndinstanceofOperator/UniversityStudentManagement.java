package Week2_Day3_this_static_final_keyWordsAndinstanceofOperator;



public class UniversityStudentManagement {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public UniversityStudentManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof UniversityStudentManagement) {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        UniversityStudentManagement s1 = new UniversityStudentManagement("Aman", 1, "A");
        UniversityStudentManagement s2 = new UniversityStudentManagement("Kiran", 2, "B");
        s1.display();
        s2.display();
        displayTotalStudents();
    }
}