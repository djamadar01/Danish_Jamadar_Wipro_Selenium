package Day3assingment;
import java.util.Arrays;

public class str10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "programming";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);

	}

}
