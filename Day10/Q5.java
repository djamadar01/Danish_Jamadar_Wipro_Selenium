package assingment10;

import java.io.FileWriter;
import java.io.IOException;

public class Q5{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("hello.txt", true);
        writer.write("\nAppended line.");
        writer.close();
	}

}
