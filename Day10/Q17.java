package assingment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path src = Paths.get("hello.txt");
        Path dest = Paths.get("copied.txt");
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
	}

}
