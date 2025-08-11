package Array;

import java.util.ArrayList;

class Student { 
    int id; 
    String name; 
    double marks; 
    Student(int id, String name, double marks) { 
        this.id = id; 
        this.name = name; 
        this.marks = marks; 
    } 
} 

public class Q9 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>(); 
        students.add(new Student(1, "Danish", 85.5)); 
        students.add(new Student(2, "Rayhan", 90.0)); 
        students.add(new Student(3, "Amit", 78.3)); 
        for (Student s : students) { 
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Marks: " + s.marks); 
        } 

	}

}
