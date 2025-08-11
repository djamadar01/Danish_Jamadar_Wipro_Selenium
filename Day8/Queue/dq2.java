package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dq2 {

	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<>(); 

        dq.addFirst("A"); 

        dq.addLast("B"); 

        System.out.println(dq); 

        dq.addFirst("C"); 

        System.out.println(dq); 

        dq.removeFirst(); 

        System.out.println(dq); 

        dq.removeLast(); 

        System.out.println(dq); 
	}

}
