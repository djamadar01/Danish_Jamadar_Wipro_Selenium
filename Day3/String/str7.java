package Day3assingment;

public class str7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "programming";
        int[] freq = new int[256];
        
        for (char c : input.toCharArray()) {
            freq[c]++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }

	}

}
