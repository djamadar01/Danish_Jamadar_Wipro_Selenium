package Array;

import java.util.ArrayList;

public class Q7 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); 
        numbers.add(10); 
        numbers.add(20); 
        numbers.add(30); 
        numbers.add(40); 
        System.out.println("Before clear: " + numbers); 
        numbers.clear(); 
        System.out.println("After clear: " + numbers); 
        System.out.println("Size of list: " + numbers.size()); 

	}

}
