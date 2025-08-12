//•	16. Write a program to walk through a directory tree and display file names using Files.walk().
package assingment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Files.walk(Paths.get(".")).forEach(System.out::println);
	}

}



