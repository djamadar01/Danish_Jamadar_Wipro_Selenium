package Hash_Set;

import java.util.Collections;
import java.util.HashSet;

public class Q3 {
	public static int getMax(HashSet<Integer> set) { 

        return Collections.max(set); 

    } 
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>(); 

        numbers.add(10); 
        numbers.add(25); 
        numbers.add(5); 
        numbers.add(40); 
        numbers.add(15); 

        System.out.println("Max: " + getMax(numbers));  
	}

}
