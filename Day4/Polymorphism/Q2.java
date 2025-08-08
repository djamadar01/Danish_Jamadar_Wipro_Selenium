package poly;

//Base class
class Bank {
 double getInterestRate() {
     return 0.0; // Default rate
 }
}

//Subclass: SBI
class SBI extends Bank {
 @Override
 double getInterestRate() {
     return 6.7;
 }
}

//Subclass: ICICI
class ICICI extends Bank {
 @Override
 double getInterestRate() {
     return 7.0;
 }
}

//Subclass: HDFC
class HDFC extends Bank {
 @Override
 double getInterestRate() {
     return 7.5;
 }
}

//Main class to test
public class Q2 {
 public static void main(String[] args) {
     Bank b1 = new SBI();
     Bank b2 = new ICICI();
     Bank b3 = new HDFC();

     System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
     System.out.println("ICICI Interest Rate: " + b2.getInterestRate() + "%");
     System.out.println("HDFC Interest Rate: " + b3.getInterestRate() + "%");
 }
}

