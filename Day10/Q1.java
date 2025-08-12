
package assingment10;

import java.io.File;
import java.io.IOException;

public class Q1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		f.createNewFile();
		System.out.println("File created!!");
	}

}


