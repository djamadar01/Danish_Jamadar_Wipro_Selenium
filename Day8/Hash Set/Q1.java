package Hash_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>(); 

        cities.add("Delhi"); 
        cities.add("Mumbai"); 
        cities.add("Chennai"); 
        cities.add("Kolkata"); 
        cities.add("Bangalore"); 
        cities.add("Mumbai"); 

        Iterator<String> itr = cities.iterator(); 

        while (itr.hasNext()) { 

            System.out.println(itr.next()); 

        }
	}

}
