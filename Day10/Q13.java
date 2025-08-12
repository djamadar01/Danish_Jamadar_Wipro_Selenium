package assingment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q13{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path file = Paths.get("newfile.txt");
        Files.createFile(file);

        Path target = Paths.get("movedfile.txt");
        Files.move(file, target, StandardCopyOption.REPLACE_EXISTING);

        Files.delete(target);
	}

}
