package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); 

        numbers.add(4); 
        numbers.add(1); 
        numbers.add(7); 
        numbers.add(2); 
        numbers.add(9); 
        numbers.add(6); 
        numbers.add(3); 

        Collections.sort(numbers); 

        System.out.println("Sorted list (Ascending): " + numbers); 

	}

}
