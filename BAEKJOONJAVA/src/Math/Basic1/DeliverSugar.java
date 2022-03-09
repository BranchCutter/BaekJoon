package Math.Basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliverSugar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kilo = Integer.parseInt(br.readLine());
        
        if (kilo == 4 || kilo == 7) System.out.println(-1);

        else if (kilo % 5 == 0) System.out.println(kilo / 5);

        else if (kilo % 5 == 1 || kilo % 5 == 3) System.out.println((kilo / 5) + 1);

        else if (kilo % 5 == 2 || kilo % 5 == 4) System.out.println((kilo / 5) + 2);
    }    
}
