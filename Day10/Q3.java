//•	3. Write a Java program to write "Hello, World!" into a file using FileWriter.
package assingment10;

import java.io.FileWriter;
import java.io.IOException;

public class Q3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("hello.txt");
        writer.write("Hello, World!");
        System.out.println("Written successfully");
        writer.close();
	}

}

