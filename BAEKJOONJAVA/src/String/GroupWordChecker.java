package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		int testCase = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < testCase; i++){ if(check() == true) cnt++; }
		
		System.out.println(cnt);
	}

	public static boolean check() throws IOException{
		boolean[] arr = new boolean[26];
		int previousNumber = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int currentNumber = (int) str.charAt(i);
			
			if(previousNumber != currentNumber) {
				if(arr[currentNumber - 'a'] == false) {
					arr[currentNumber - 'a'] = true;
					previousNumber = currentNumber;
				}
				
				else return false;
			}

			else continue;
		}
		return true;
	}
}
