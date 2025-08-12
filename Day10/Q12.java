//•	12. Write a program to search for a specific word in a file and count its occurrences.
package assingment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("hello.txt"));
        String word = "Hello";
        int count = 0;
        while (sc.hasNext()) {
            if (sc.next().equals(word)) count++;
        }
        System.out.println("Occurrences of \"" + word + "\": " + count);
        sc.close();
	}

}

