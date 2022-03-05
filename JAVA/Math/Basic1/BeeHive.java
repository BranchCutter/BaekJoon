package JAVA.Math.Basic1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeeHive {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int range = 2;
        int cnt = 1;

        if (N != 1) {
            while(range <= N){
                range += cnt * 6;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
