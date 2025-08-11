package Hash_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class t3 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>(Comparator.reverseOrder()); 

        set.add("Apple"); 

        set.add("Banana"); 

        set.add("Mango"); 

        set.add("Orange"); 

        System.out.println(set); 
	}

}
