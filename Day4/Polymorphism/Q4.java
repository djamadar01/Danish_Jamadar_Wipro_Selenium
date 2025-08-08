package poly;

class Vehicle {
 Vehicle() {
     System.out.println("Vehicle Created");
 }

 void run() {
     System.out.println("Vehicle is running");
 }
}

class Bike extends Vehicle {
 Bike() {
     super(); // Calls Vehicle constructor
     System.out.println("Bike Created");
 }

 void run() {
     System.out.println("Bike is running");
 }
}

public class Q4 {
 public static void main(String[] args) {
     Vehicle obj = new Bike(); 
     obj.run(); 
 }
}

