package Day_2_Assingment;

public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1;
		System.out.print(a + " " + b);
		for (int i = 3; i <= 10; i++) {
		    int c = a + b;
		    System.out.print(" " + c);
		    a = b;
		    b = c;
		}
		System.out.println();


	}

}
