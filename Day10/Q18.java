package assingment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q18{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("hello.txt");
        long size = Files.size(path);
        System.out.println("File size: " + size + " bytes");
	}

}


//File size: 43 bytes