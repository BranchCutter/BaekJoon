package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int givenX = Integer.parseInt(st.nextToken());
        int givenY = Integer.parseInt(st.nextToken());
        int givenW = Integer.parseInt(st.nextToken());
        int givenH = Integer.parseInt(st.nextToken());

        int xMin = Math.min(givenX, givenW - givenX);
        int yMin = Math.min(givenY, givenH - givenY);

        System.out.println(Math.min(xMin, yMin));
    }
}
