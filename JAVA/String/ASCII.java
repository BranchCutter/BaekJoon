import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASCII{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char asciiChar = br.readLine().charAt(0);
		int asciiNum = (int)asciiChar;
		System.out.println(asciiNum);
	}
}
