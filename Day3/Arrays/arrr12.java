package Day3assingment;

import java.util.Scanner;

public class arrr12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rotation direction (L/R): ");
        char dir = sc.next().charAt(0);
        System.out.print("Enter rotation count: ");
        int count = sc.nextInt();
        
        if (dir == 'L') {
            for (int i = 0; i < count; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        } else {
            for (int i = 0; i < count; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
        
        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
