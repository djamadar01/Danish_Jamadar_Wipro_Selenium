package assingment10;

import java.io.File;
import java.io.FilenameFilter;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
        FilenameFilter filter = (d, name) -> name.endsWith(".txt");
        File[] files = dir.listFiles(filter);
        for (File f : files) {
            System.out.println(f.getName());
        }
	}

}