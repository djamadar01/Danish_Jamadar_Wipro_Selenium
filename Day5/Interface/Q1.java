package interface_codes;

public class Q1 implements CharSequence { 

    private String reversed; 

    public Q1(String input) { 

        StringBuilder sb = new StringBuilder(input); 

        this.reversed = sb.reverse().toString(); 

    } 

    public int length() { 

        return reversed.length(); 

    } 

    public char charAt(int index) { 

        return reversed.charAt(index); 

    } 

    public CharSequence subSequence(int start, int end) { 

        return reversed.substring(start, end); 

    } 

    public String toString() { 

        return reversed; 

    } 

    public static void main(String[] args) { 

        Q1 bs = new Q1("Danish"); 

 

        System.out.println("Reversed string: " + bs);  

        System.out.println("Length: " + bs.length());  

        System.out.println("Character at index 1: " + bs.charAt(1));  

        System.out.println("SubSequence (1, 4): " + bs.subSequence(1, 4));  

    } 

} 
