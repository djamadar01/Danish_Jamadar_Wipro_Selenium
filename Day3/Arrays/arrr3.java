package Day3assingment;

public class arrr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 2, 9, 1, 5};
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

	}

}
