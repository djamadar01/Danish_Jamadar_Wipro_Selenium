package lambda_codes;

interface NumberCompare { 

    int compare(int a, int b); 

} 

public class Q8 { 

    public static void main(String[] args) { 

        NumberCompare max = (a, b) -> (a > b) ? a : b; 

        NumberCompare min = (a, b) -> (a < b) ? a : b; 

        int x = 12, y = 25; 

        System.out.println("Max of " + x + " and " + y + ": " + max.compare(x, y)); 

        System.out.println("Min of " + x + " and " + y + ": " + min.compare(x, y)); 

    } 

} 
