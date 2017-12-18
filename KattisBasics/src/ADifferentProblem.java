import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/different
 * Difficulty: 2.1
 */
public class ADifferentProblem {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st;
		while((line = reader.readLine()) != null) {
			st = new StringTokenizer(line);
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			System.out.println(Math.abs(a - b));
		}

	}
	
}
