package Day5_String;

import java.util.Scanner;

public class SubstringComparison  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(str1.equals(str2));
        sc.close();
    }
}

//// Interface for payment
interface Payable {
    double calculatePayment();
}

// Patient class
class Patient {
    String name;
    String disease;

    Patient(String n, String d) {
        name = n;
        disease = d;
    }

    void getSummary() {
        System.out.println("Patient Name: " + name);
        System.out.println("Disease: " + disease);
    }

    void displayInfo() {
        System.out.println("This is a general patient.");
    }
}

// InPatient class (Inheritance)
class InPatient extends Patient {
    InPatient(String n, String d) {
        super(n, d);
    }

    void displayInfo() {
        System.out.println("This is an In-Patient.");
    }
}

// OutPatient class (Inheritance)
class OutPatient extends Patient {
    OutPatient(String n, String d) {
        super(n, d);
    }

    void displayInfo() {
        System.out.println("This is an Out-Patient.");
    }
}

// Doctor class
class Doctor {
    String name;
    String department;

    Doctor(String n, String dept) {
        name = n;
        department = dept;
    }

    void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Bill class (implements interface)
class Bill implements Payable {
    double amount;

    Bill(double amt) {
        amount = amt;
    }

    public double calculatePayment() {
        return amount + (amount * 0.1); // 10% tax
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        InPatient p = new InPatient("Krishna", "Fever");
        Doctor d = new Doctor("Dr. Mehta", "Medicine");
        Bill b = new Bill(1000);

        p.getSummary();
        p.displayInfo();
        d.displayInfo();
        System.out.println("Total Bill: " + b.calculatePayment());
    }
}