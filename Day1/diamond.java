package Day_2_Assingment;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		// upper half
		for (int i = 1; i <= n; i++) {
		    for (int j = i; j < n; j++) System.out.print(" ");
		    for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
		    System.out.println();
		}
		// lower half
		for (int i = n - 1; i >= 1; i--) {
		    for (int j = n; j > i; j--) System.out.print(" ");
		    for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
		    System.out.println();
		}


	}

}
