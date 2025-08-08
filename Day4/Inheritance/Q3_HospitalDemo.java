package oop;

//Superclass
class Hospital {
 String hospitalName = "City Care Hospital";
 String location = "Downtown";

 void hospitalDetails() {
     System.out.println("Hospital Name: " + hospitalName);
     System.out.println("Location: " + location);
 }
}

//Subclass
class Patient extends Hospital {
 String patientName;
 int patientId;

 Patient(String patientName, int patientId) {
     // Calling parent class constructor implicitly (default)
     super.hospitalDetails(); // Access parent method
     this.patientName = patientName;
     this.patientId = patientId;
 }

 void showPatientDetails() {
     System.out.println("Patient Name: " + patientName);
     System.out.println("Patient ID: " + patientId);
     System.out.println("Treated at: " + super.hospitalName); // Access parent variable
 }
}

//Main Class
public class Q3_HospitalDemo {
 public static void main(String[] args) {
     Patient p1 = new Patient("John Doe", 101);
     p1.showPatientDetails();
 }
}

