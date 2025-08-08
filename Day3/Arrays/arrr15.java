package Day3assingment;

public class arrr15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Find first odd from left
            while (arr[left] % 2 == 0 && left < right) left++;
            
            // Find first even from right
            while (arr[right] % 2 != 0 && left < right) right--;
            
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        System.out.println("Segregated array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
