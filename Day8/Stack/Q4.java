package Stack;

import java.util.Stack;
import java.util.*; 
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        System.out.print("Enter decimal number: "); 
        int num = sc.nextInt(); 
        Stack<Integer> stack = new Stack<>(); 
        while (num > 0) { 
            stack.push(num % 2); 
            num /= 2; 
        } 
        System.out.print("Binary: "); 
        while (!stack.isEmpty()) { 
            System.out.print(stack.pop()); 

        } 
	}

}
