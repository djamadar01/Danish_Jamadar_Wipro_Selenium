package assingment10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Q15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("data.txt");
		String data="My name is :\tDanish Jamadar";
		Files.write(path, data.getBytes());
		String append = "\nAppended Line";
		Files.write(path, append.getBytes(), StandardOpenOption.APPEND);
		
	}
}

