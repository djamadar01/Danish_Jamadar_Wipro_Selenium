package Day_2_Assingment;

public class palindrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int original = num, reversed = 0;
		while (num != 0) {
		    int digit = num % 10;
		    reversed = reversed * 10 + digit;
		    num /= 10;
		}
		System.out.println(original + " is " + (original == reversed ? "a palindrome" : "not a palindrome"));


	}

}
