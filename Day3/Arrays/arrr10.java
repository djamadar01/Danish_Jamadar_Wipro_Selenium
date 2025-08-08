package Day3assingment;

public class arrr10 {

	 public static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        System.out.println("Prime numbers in array:");
	        for (int num : arr) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

}
