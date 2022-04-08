package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int R1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());
            int R3 = Integer.parseInt(st.nextToken());

            
        }
    }
}
