package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dq3 {

	public static void main(String[] args) {
		Deque<String> back=new ArrayDeque<>(); 

        Deque<String> forward=new ArrayDeque<>(); 

        String current="Home"; 

        back.push(current); 

        current="Page1"; 

 back.push(current); 

        current="Page2"; 

back.push(current); 

        forward.push(back.pop()); 

        current=back.peek(); 

        System.out.println("Back to:"+current); 

        back.push(forward.pop()); 

        System.out.println("Forward to:"+back.peek()); 
	}

}
