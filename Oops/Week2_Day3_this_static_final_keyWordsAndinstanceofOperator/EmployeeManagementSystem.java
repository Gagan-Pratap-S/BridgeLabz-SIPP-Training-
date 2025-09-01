package Week2_Day3_this_static_final_keyWordsAndinstanceofOperator;



public class EmployeeManagementSystem {
    static String companyName = "TechSoft";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    public EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        if (this instanceof EmployeeManagementSystem) {
            System.out.println("ID: " + id + ", Name: " + name + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem e1 = new EmployeeManagementSystem("Ravi", 101, "Developer");
        EmployeeManagementSystem e2 = new EmployeeManagementSystem("Anu", 102, "Tester");
        e1.display();
        e2.display();
        displayTotalEmployees();
    }
}