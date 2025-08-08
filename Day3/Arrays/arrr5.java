package Day3assingment;
import java.util.Scanner;

public class arrr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(num + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(num + " not found in array");

	}

}
