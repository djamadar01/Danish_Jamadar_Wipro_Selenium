package Collection_codes;

import java.util.LinkedList;

public class Q1 {

	public static void main(String[] args) {
		LinkedList<String> colors = new LinkedList<>(); 
        colors.add("Red"); 
        colors.add("Green"); 
        colors.add("Blue"); 
        colors.add("Yellow"); 
        colors.add("Purple"); 
        System.out.println("Colors in the LinkedList:"); 

        for (String color : colors) { 

            System.out.println(color); 

        } 
	}

}
