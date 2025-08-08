package oop;

//Base class
class After12th {
 void displayStream() {
     System.out.println("Options available after 12th standard.");
 }
}

//Derived classes for main categories
class Engineering extends After12th {
 void courses() {
     System.out.println("Engineering courses: IT, Mechanical, CS");
 }
}

class Medical extends After12th {
 void courses() {
     System.out.println("Medical courses: MBBS, BDS");
 }
}

class OtherCourses extends After12th {
 void courses() {
     System.out.println("Other courses: BCA, BBA");
 }
}

//Main Class
public class Q4{
 public static void main(String[] args) {
     Engineering eng = new Engineering();
     eng.displayStream();
     eng.courses();

     Medical med = new Medical();
     med.displayStream();
     med.courses();

     OtherCourses other = new OtherCourses();
     other.displayStream();
     other.courses();
 }
}

