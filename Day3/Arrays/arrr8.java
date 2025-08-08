package Day3assingment;

public class arrr8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = {1, 2, 3, 4, 5};
        int[] dest = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
        System.out.println("Copied array:");
        for (int num : dest) {
            System.out.print(num + " ");
        }

	}

}
