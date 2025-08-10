package lambda_codes;

import java.util.function.Predicate; 

public class Q3 { 

    public static void main(String[] args) { 

        Predicate<String> isEmpty = s -> s.isEmpty(); 

        String str1 = ""; 

        String str2 = "Hello"; 

        System.out.println("Is str1 empty? " + isEmpty.test(str1));   

        System.out.println("Is str2 empty? " + isEmpty.test(str2));   

    } 

} 
