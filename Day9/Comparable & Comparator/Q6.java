package Assingment9;

import java.util.ArrayList;
import java.util.List;
import java.util.*; 

class Stud{ 
    String name; 
    double marks; 
    Stud(String name,double marks){ 
        this.name=name; 
        this.marks=marks; 

    } 

    public String toString(){ 
        return name+" "+marks; 
    } 

} 

public class Q6{ 
    public static void main(String[] args){ 
        List<Stud> students=new ArrayList<>(); 
        students.add(new Stud("Ravi",85.5)); 
        students.add(new Stud("Priya",90.0)); 
        students.add(new Stud("Amit",78.0)); 
        students.sort((s1,s2) -> Double.compare(s2.marks,s1.marks)); 

        for(Stud s:students) 
            System.out.println(s); 

    } 

} 
