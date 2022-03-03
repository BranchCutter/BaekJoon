package JAVA.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSum{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0, counter;
		char placeValue;
		String firstNum = br.readLine();
		for(int i = 0; i < N; i++){
			placeValue = firstNum.charAt(i);
			counter = (int)placeValue - 48;
			sum += counter;
		}
		System.out.println(sum);
	}
}
