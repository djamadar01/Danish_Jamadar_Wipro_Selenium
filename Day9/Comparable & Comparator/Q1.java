package Assingment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> { 
    int rollNo; 
    String name; 
    double marks; 
    Student(int rollNo, String name, double marks) { 
        this.rollNo = rollNo; 
        this.name = name; 
        this.marks = marks; 

    } 
    public int compareTo(Student other) { 
        return this.rollNo - other.rollNo; 
    } 

    public String toString() { 
        return rollNo + " " + name + " " + marks; 

    } 

} 

public class Q1{ 
    public static void main(String[] args) { 
        List<Student> students = new ArrayList<>(); 
        students.add(new Student(3, "Danish", 85.5)); 
        students.add(new Student(1, "Rayahn", 90.0)); 
        students.add(new Student(2, "Amit", 78.0)); 
        Collections.sort(students); 
        for (Student s : students) { 
            System.out.println(s); 

        } 

    } 

} 
