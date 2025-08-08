package Day3assingment;

public class str1 {
    public static void main(String[] args) {
	        String input = "Programming";
	        int count = 0;
	        for (char c : input.toLowerCase().toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++;
	            }
	        }
	        System.out.println(count + " Vowels");
	    }
	}

