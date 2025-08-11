package Collection_codes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q8 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(); 
        list.add("Apple"); 
        list.add("Banana"); 
        list.add("Cherry"); 
        ArrayList<String> arrayList = new ArrayList<>(list); 
        System.out.println("LinkedList: " + list); 
        System.out.println("ArrayList: " + arrayList); 
	}

}
