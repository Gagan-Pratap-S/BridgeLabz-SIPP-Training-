package Week2_Day2_Constructors.InstanceVsClassVariableAndObject;


public class OnlineCourseManagement {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Academy";

    public OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        OnlineCourseManagement c1 = new OnlineCourseManagement("Java", 6, 15000);
        OnlineCourseManagement c2 = new OnlineCourseManagement("Python", 8, 18000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}