package Array;

import java.util.ArrayList;

import java.util.Scanner; 
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>(); 

        numbers.add(10); 
        numbers.add(20); 
        numbers.add(30); 
        numbers.add(40); 
        numbers.add(50); 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number to search: "); 
        int num = sc.nextInt(); 
        if (numbers.contains(num)) { 
            System.out.println(num + " is present in the list."); 
        } else { 
            System.out.println(num + " is not present in the list."); 
        } 
	}

}
