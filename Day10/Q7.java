package assingment10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("hello.txt");
        FileWriter fw = new FileWriter("copy.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
	}

}


