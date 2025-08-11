package Hash_Set;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student{ 

    int id; 

    String name; 

    Student(int id,String name){ 

        this.id=id; 

        this.name=name; 

    } 

    public int hashCode(){ 

        return Objects.hash(id,name); 

    } 

    public boolean equals(Object obj){ 

        if(this==obj)return true; 

        if(!(obj instanceof Student))return false; 

        Student s=(Student)obj; 

        return id==s.id&&name.equals(s.name); 

    } 

    public String toString(){ 

        return id+"-"+name; 

    } 

} 
public class l2 {

	public static void main(String[] args) {
		LinkedHashSet<Student> students=new LinkedHashSet<>(); 

        students.add(new Student(1,"Ravi")); 

        students.add(new Student(2,"Priya")); 

        students.add(new Student(3,"Amit")); 

        students.add(new Student(1,"Ravi")); 

        System.out.println("Students in LinkedHashSet:"+students); 
	}

}
