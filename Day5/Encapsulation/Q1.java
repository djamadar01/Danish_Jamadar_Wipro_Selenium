package enacpul;

public class Q1 { 

    private String name; 

    private int rollNumber; 

    private int marks; 

    public Q1(String name, int rollNumber, int marks) { 

        this.name = name; 

        this.rollNumber = rollNumber; 

        if (marks >= 0 && marks <= 100) { 

            this.marks = marks; 

        } else { 

            this.marks = 0;  

        } 

    } 

    // Getter methods 

    public String getName() { 

        return name; 

    } 

    public int getRollNumber() { 

        return rollNumber; 

    } 

    public int getMarks() { 

        return marks; 

    } 

    public void displayDetails() { 

        System.out.println("Name: " + name); 

        System.out.println("Roll Number: " + rollNumber); 

        System.out.println("Marks: " + marks); 

    } 

    public void inputMarks(int newMarks) { 

        if (newMarks > this.marks && newMarks <= 100) { 

            this.marks = newMarks; 

        } else { 

            System.out.println("Invalid mark update"); 

        } 

    } 

    public static void main(String[] args) { 

    	Q1 s1 = new Q1("Danish", 101, 95); 

        s1.displayDetails(); 

        s1.inputMarks(90);   

        s1.inputMarks(50);   

        System.out.println("After attempted updates:"); 

        s1.displayDetails(); 

    } 

}