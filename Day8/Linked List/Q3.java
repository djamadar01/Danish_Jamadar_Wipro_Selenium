package Collection_codes;

import java.util.LinkedList;

public class Q3 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>(); 
        names.add("Alice"); 
        names.add("Bob"); 
        names.add("Charlie"); 
       System.out.println("Before Insertion: " + names); 
        names.add(2, "David");  
        System.out.println("After Insertion: " + names); 
	}
}
