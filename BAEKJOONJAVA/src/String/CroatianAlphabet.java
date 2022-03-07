package String;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CroatianAlphabet{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int leng = str.length();
		int cnt = 0;
		
		for(int i = 0; i < leng; i++){
			if(str.charAt(i) == 'c' && i < leng - 1) {
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') i++;
			}
			
			else if(str.charAt(i) == 'd' && i < leng - 1) {
				if(str.charAt(i + 1) == '-') i++;
				else if(str.charAt(i + 1) == 'z' && i < leng - 2){
					if(str.charAt(i + 2) == '=') i += 2;
				}
			}
			
			else if(str.charAt(i) == 'l' && i < leng - 1) {
				if(str.charAt(i + 1) == 'j') i++;
			}
			
			else if(str.charAt(i) == 'n' && i < leng - 1) {
				if(str.charAt(i + 1) == 'j') i++;
			}
			
			else if(str.charAt(i) == 's' && i < leng - 1) {
				if(str.charAt(i + 1) == '=') i++;
			}
			
			else if(str.charAt(i) == 'z' && i < leng - 1) {
				if(str.charAt(i + 1) == '=') i++;
			}
			cnt++;
		}
		System.out.print(cnt);
	}
}
