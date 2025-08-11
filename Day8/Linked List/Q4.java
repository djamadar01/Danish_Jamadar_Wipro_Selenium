package Collection_codes;

import java.util.LinkedList;

public class Q4 {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<>(); 

        animals.add("Dog"); 
        animals.add("Cat"); 
        animals.add("Elephant"); 
        animals.add("Tiger"); 
        animals.add("Lion"); 
        System.out.println("Original List: " + animals); 
        animals.removeFirst(); 
        System.out.println("After removing first: " + animals); 
        animals.removeLast(); 
        System.out.println("After removing last: " + animals); 
        animals.remove("Elephant"); 
        System.out.println("After removing 'Elephant': " + animals); 
	}

}
