package assingment10;

import java.io.File;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
	}

}
