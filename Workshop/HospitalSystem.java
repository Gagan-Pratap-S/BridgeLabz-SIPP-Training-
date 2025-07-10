interface Payable {
    double calculatePayment();
}

class Patient {
    String name;
    String disease;

    Patient(String n, String d) {
        name = n;
        disease = d;
    }

    void getSummary(){
        System.out.println("Patient: " + name);
        System.out.println("Disease: " + disease);
    }

    void displayInfo(){
        System.out.println("this is general patient");
    }

}

class Doctor{
    String name;
    String department;

    Doctor(String n, String dept) {
        name = n;
        department = dept;
    }
    void displayInfo(){
        System.out.println("Doctor Name: "+ name);
        System.out.println("Department name: "+ department);
    }
}

class Bill{
    double amount;

    Bill(double amt){
        amount = amt;
    }
    public double calculatePayment(){
        return amount+(amount*0.1);
    }
}
public class HospitalSystem{
    public static void main(String[] args) {
        Patient p = new Patient("John", "Cancer");
        Doctor d = new Doctor("Dr. Smith", "Oncolgy");
        Bill b = new Bill(1000.0);
        p.getSummary();
        p.displayInfo();
        d.displayInfo();
        System.out.println("Total bill: " + b.calculatePayment());
        
    }
}




