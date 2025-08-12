
package assingment10;

import java.io.File;

public class Q2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		if(f.exists()) {
			System.out.println("File Exist!!");
		}else {
            System.out.println("File does not exist.");
        }
	}

}

