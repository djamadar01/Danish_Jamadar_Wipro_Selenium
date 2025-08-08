package Day_2_Assingment;

public class sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6785;
		int sum = 0;
		while (number != 0) {
		    sum += number % 10;
		    number /= 10;
		}
		System.out.println("Sum of digits = " + sum);


	}

}
