package Collection_codes;
import java.util.LinkedList; 
import java.util.Scanner; 
public class Q5 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(); 
        list.add("Apple"); 
        list.add("Banana"); 
        list.add("Mango"); 
        list.add("Orange"); 
        list.add("Grapes"); 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a fruit to search: "); 
       String fruit = sc.nextLine(); 
        if (list.contains(fruit)) { 
            System.out.println(fruit + " is found in the list."); 
        } else { 
            System.out.println(fruit + " is not found in the list."); 
        } 
	}

}
