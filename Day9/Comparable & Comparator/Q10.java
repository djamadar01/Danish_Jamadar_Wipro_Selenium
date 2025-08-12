package Assingment9;

import java.util.*; 

public class Q10{ 
    public static void main(String[] args){ 
        List<String> strings = new ArrayList<>(Arrays.asList("Apple", "Banana", "Kiwi", "Orange")); 

        Collections.sort(strings, new Comparator<String>(){ 
            public int compare(String s1, String s2){ 
                return s1.length() - s2.length(); 
            } 

        }); 

        for(String s : strings) 
           System.out.println(s); 
    } 

} 
