package Week2_Day4_ObjectModeling_ObjectRelationshipsAndCommunication;


public class HospitalDoctorPatient {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Smith");
        Patient p1 = new Patient("yuigh");
        d1.consult(p1);
    }
}

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }
    void consult(Patient p) {
        System.out.println(name + " consulting " + p.name);
    }
}

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}