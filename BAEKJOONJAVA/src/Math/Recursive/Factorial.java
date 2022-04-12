package Math.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int numFactorial = 1;

        for(int i = 1; i <= num; i++) { numFactorial *= i;}

        System.out.print(numFactorial);
    }
}
