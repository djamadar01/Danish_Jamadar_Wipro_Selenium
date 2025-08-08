package Day_2_Assingment;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
		        isPrime = false;
		        break;
		    }
		}
		System.out.println(n + " is " + (isPrime ? "a prime number" : "not a prime number"));


	}

}
