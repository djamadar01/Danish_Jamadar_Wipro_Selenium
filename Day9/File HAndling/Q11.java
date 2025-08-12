package ass92;

import java.io.File; 

import java.util.Scanner; 

 

public class Q11 { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter folder path: "); 

        String path = sc.nextLine(); 

 

        File folder = new File(path); 

        if (folder.exists() && folder.isDirectory()) { 

            File[] files = folder.listFiles(); 

            System.out.println("Files in the folder:"); 

            for (File f : files) { 

                if (f.isFile()) { 

                    System.out.println(f.getName()); 

                } 

            } 

        } else { 

            System.out.println("Invalid folder path."); 

        } 

        sc.close(); 

    } 

} 
