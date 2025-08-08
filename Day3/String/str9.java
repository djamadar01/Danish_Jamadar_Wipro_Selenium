package Day3assingment;

public class str9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java 123 @#";
        int letters = 0, digits = 0, spaces = 0, special = 0;
        
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isWhitespace(c)) spaces++;
            else special++;
        }
        
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special: " + special);

	}

}
