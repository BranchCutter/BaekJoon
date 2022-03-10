package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt = 0;
        
        for (int i = 0 ; i < testCase; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num) == true) cnt++;
        }
        System.out.println(cnt);
    }
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        
        for (int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
        return true;
    }
}