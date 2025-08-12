package assingment10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
	}

}


