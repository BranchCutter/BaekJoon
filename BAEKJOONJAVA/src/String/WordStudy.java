package JAVA.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str = br.readLine().toUpperCase();

		for(int i = 0; i < str.length(); i++){
			arr[str.charAt(i) - 65]++;
		}
		
		int max = -1;
		char mostUsedAlphabet = '?';
		for(int i = 0; i < 26; i++){
			if(arr[i] > max){
				max = arr[i];
				mostUsedAlphabet = (char) (i + 65);
			}
			else if (arr[i] == max){
				mostUsedAlphabet = '?';
			}
		}
		System.out.print(mostUsedAlphabet);
	}
}
