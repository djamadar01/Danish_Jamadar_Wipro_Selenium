package Array;

import java.util.ArrayList;

public class Q10 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(); 
        list1.add("Apple"); 
        list1.add("Banana"); 
        list1.add("Cherry"); 
        ArrayList<String> list2 = new ArrayList<>(); 
        list2.addAll(list1); 
        System.out.println("First List: " + list1); 
       System.out.println("Second List (Copied): " + list2); 
	}

}
