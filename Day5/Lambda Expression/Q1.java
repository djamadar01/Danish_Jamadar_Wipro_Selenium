package lambda_codes;

interface Addable { 

	 int add(int a, int b); 

	} 

	public class Q1 { 

	 public static void main(String[] args) { 

	     Addable sum = (a, b) -> a + b; 

	     int result = sum.add(10, 20); 

	     System.out.println("Sum: " + result); 

	 } 

	} 