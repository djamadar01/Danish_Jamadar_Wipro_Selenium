package Hash_Set;

import java.util.LinkedHashSet;

public class l1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>(); 

        numbers.add(10); 

        numbers.add(5); 

        numbers.add(20); 

        numbers.add(15); 

        numbers.add(5); // duplicate 

 

        System.out.println("LinkedHashSet elements: " + numbers); 

	}

}
