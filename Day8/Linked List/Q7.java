package Collection_codes;

import java.util.Collections;
import java.util.LinkedList;

public class Q7 {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>(); 
        numbers.add(25); 
        numbers.add(5); 
        numbers.add(15); 
        numbers.add(40); 
        numbers.add(10); 
        Collections.sort(numbers); 
        System.out.println("Sorted list: " + numbers); 
	}

}
