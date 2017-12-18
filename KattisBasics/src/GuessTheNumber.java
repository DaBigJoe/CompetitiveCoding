import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://open.kattis.com/problems/guess
 * Difficulty: 3.4
 */
public class GuessTheNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int upperLimit = 1000;
		int lowerLimit = 1;
		while(true) {
			int guess = guess(upperLimit, lowerLimit);
			System.out.println(guess);
			String s = reader.readLine();
			if(s.equals("correct"))
				break;
			else if(s.equals("higher"))
				lowerLimit = guess + 1;
			else
				upperLimit = guess - 1;
		}
	}
	
	public static int guess(int upperLimit, int lowerLimit) {
		int s = upperLimit + lowerLimit;
		if(s % 2 == 1)
			s--;
		return s/2;
	}
	
}
