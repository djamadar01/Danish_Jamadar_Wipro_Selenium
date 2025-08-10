package lambda_codes;

interface SumCalculator { 

	 int sum(int a, int b); 

	} 

	public class Q2 { 

	 public static void main(String[] args) { 

	     SumCalculator calculator = (a, b) -> a + b; 

	     int result = calculator.sum(15, 25); 

	     System.out.println("Sum: " + result); 

	 } 

	} 
