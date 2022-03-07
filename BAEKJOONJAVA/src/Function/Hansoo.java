package JAVA.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansoo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}

	public static int arithmetic_sequence(int num){
		int cnt = 0;

		if(num < 100) return num;
		else {
			cnt = 99;
			if(num == 1000){
				num = 999;
			}
			
			for(int i = 100; i <= num; i++){
				int third = i / 100;
				int second = (i / 10) % 10;
				int first = i % 10;

				if((third - second) == (second - first)) cnt++;
			}
		}
		return cnt;
	}
}
