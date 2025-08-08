package Day3assingment;

public class arrr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 2, 9, 1, 5};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second highest: " + second);

	}

}
