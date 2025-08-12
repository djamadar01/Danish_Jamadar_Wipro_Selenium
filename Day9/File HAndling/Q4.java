package ass92;


import java.io.BufferedReader; 

import java.io.FileReader; 

import java.io.IOException; 



public class Q4 { 

   public static void main(String[] args) { 

       int lineCount = 0; 
       int wordCount = 0; 



       try { 

           BufferedReader reader = new BufferedReader(new FileReader("Student.txt")); 
           String line; 
           while ((line = reader.readLine()) != null) { 
               lineCount++;  
              String[] words = line.trim().split("\\s+"); 
               if (!line.trim().isEmpty()) {  
                   wordCount += words.length; 
              } 
           } 



           reader.close(); 
           System.out.println("Number of lines: " + lineCount); 
           System.out.println("Number of words: " + wordCount); 



       } catch (IOException e) { 
           System.out.println("An error occurred while reading the file."); 
           e.printStackTrace(); 
       } 
   } 

} 
