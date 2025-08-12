package assingment10;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Q11 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("hello.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
	}

}

