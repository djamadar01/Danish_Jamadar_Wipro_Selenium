package Assingment9;

import java.util.*; 

class Studen implements Comparable<Studen>{ 

    String name; 
    double marks; 

    Studen(String name,double marks){
        this.name=name; 
        this.marks=marks; 
    } 

    public int compareTo(Studen s){ 
        return this.name.compareTo(s.name); 
    } 

    public String toString(){ 
       return name+" "+marks; 
    } 
} 

public class Q11{ 
    public static void main(String[] args){ 

        List<Studen> student=new ArrayList<>(); 

        student.add(new Studen("Ravi",85.5)); 
        student.add(new Studen("Priya",90.0)); 
        student.add(new Studen("Amit",78.0)); 

        System.out.println("Sort by name:"); 

        Collections.sort(student);

        for(Studen s:student) 
            System.out.println(s); 
        System.out.println("Sort by marks:"); 

        student.sort(Comparator.comparingDouble(s -> s.marks)); 

        for(Studen s:student) 
            System.out.println(s); 
    } 

} 
