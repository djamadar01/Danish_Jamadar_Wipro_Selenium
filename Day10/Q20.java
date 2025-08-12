package assingment10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q20 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee emp = (Employee) ois.readObject();
        System.out.println("ID: " + emp.id + ", Name: " + emp.name);
        ois.close();
	}

}

