package Math.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fibonacci = new int[n+1];
        
        for (int i = 0; i < fibonacci.length; i++) {
            if (i == 0) fibonacci[0] = 0;
            else if (i == 1) fibonacci[1] = 1;
            else fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        System.out.print(fibonacci[n]);
    }
}