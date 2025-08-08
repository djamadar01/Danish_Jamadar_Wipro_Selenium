package poly;

//Calculator class with overloaded add() methods
public class Calculator {

 // 1. Add two integers
 void add(int a, int b) {
	 int c = a+b;
	 System.out.println("SUm Of Integers is "+c);
 }

 // 2. Add three integers
 void add(int a, int b, int c) {
	 int z = a+b+c;
	 System.out.println("SUm Of Integers is "+z); }

 // 3. Add two doubles
 void add(double a, double b) {
	 double p = a + b;
	 System.out.println("SUm Of Integers is "+p); }

 public static void main(String[] args) {
     Calculator calc = new Calculator();
     calc.add(5, 10);
     calc.add(5, 10, 15);
     calc.add(5.5, 10.5);
 }
}

