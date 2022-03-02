import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String S = br.readLine();
		char placeValue;
		int index;
		for(int i = 0; i < 26; i++){ arr[i] = -1; }

		for(int i = 0; i < S.length(); i++){
			placeValue = S.charAt(i);
			index = (int)placeValue - 97;
			if(arr[index] != -1) continue;
			arr[index] = i;
		}

		for(int value : arr) { System.out.printf("%d ",value); }
	}
}
