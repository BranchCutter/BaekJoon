package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c && c == 0) break;
            
            if ((a * a) + (b * b) == c * c) sb.append("right").append("\n");

            else if ((a * a) + (c * c) == (b * b)) sb.append("right").append("\n");

            else if ((b * b) + (c * c) == a * a) sb.append("right").append("\n");

            else sb.append("wrong").append("\n");
        }
        System.out.println(sb);
    }
}
