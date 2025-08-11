package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Q8 {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>(); 
        cities.add("Delhi"); 
        cities.add("Mumbai"); 
        cities.add("Chennai"); 
       cities.add("Kolkata"); 
        Iterator<String> itr = cities.iterator(); 
        while (itr.hasNext()) { 
            System.out.println(itr.next()); 
        } 

	}

}
