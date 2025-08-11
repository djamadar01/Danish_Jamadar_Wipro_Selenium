package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class q3 {
	public static List<Integer> getEvenNumbers(Queue<Integer> queue){ 

        List<Integer> evens=new ArrayList<>(); 

        for(int num:queue){ 

            if(num%2==0)evens.add(num); 

        } 

        return evens; 

    } 
	public static void main(String[] args) {
		Queue<Integer> nums=new LinkedList<>(); 

        nums.add(1); 

        nums.add(2); 

        nums.add(3); 

        nums.add(4); 

        nums.add(6); 

        System.out.println(getEvenNumbers(nums)); 
	}

}
