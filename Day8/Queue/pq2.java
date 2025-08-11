package queue;

import java.util.PriorityQueue;

public class pq2 {
	static class PrintJob{ 
	    String jobName; 
	    int priority; 
	    PrintJob(String jobName,int priority){ 
	        this.jobName=jobName; 
	        this.priority=priority; 
	    } 
	    public String toString(){ 
	        return jobName+"("+priority+")"; 
	    } 
	} 
	public static void main(String[] args) {
		  PriorityQueue<PrintJob> pq=new PriorityQueue<>((a,b)->b.priority-a.priority); 

	        pq.add(new PrintJob("Job1",2)); 
	        pq.add(new PrintJob("Job2",5)); 
	        pq.add(new PrintJob("Job3",3)); 

	        while(!pq.isEmpty()){ 

	            System.out.println("Printing:"+pq.poll()); 

	        } 
	}

}
