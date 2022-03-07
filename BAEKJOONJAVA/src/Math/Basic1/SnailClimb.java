package Math.Basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailClimb {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int climb = Integer.parseInt(st.nextToken());
        int slip = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int day = (height - slip) / (climb - slip);

        if ((height - slip) % (climb - slip) != 0) day++;

        System.out.print(day);
        
    }
}
