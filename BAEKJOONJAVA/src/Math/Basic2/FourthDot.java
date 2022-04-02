package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourthDot {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] coordinate1 = br.readLine().split(" ");
        String[] coordinate2 = br.readLine().split(" ");
        String[] coordinate3 = br.readLine().split(" ");

        String x, y;

        if (coordinate1[0].equals(coordinate2[0])) x = coordinate3[0];

        else if (coordinate1[0].equals(coordinate3[0])) x = coordinate2[0];

        else x = coordinate1[0];

        if (coordinate1[1].equals(coordinate2[1])) y = coordinate3[1];

        else if (coordinate1[1].equals(coordinate3[1])) y = coordinate2[1];

        else y = coordinate1[1];

        System.out.println(x + " " + y);
    }
}
