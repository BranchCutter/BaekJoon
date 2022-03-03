package JAVA.For;

import java.util.Scanner;

public class TestCase{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for (int i = 0; i < testCase; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a+b);
		}
		scanner.close();
	}
}
