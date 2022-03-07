package Math.Basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int lockedPrice = Integer.parseInt(st.nextToken());
        int workerPrice = Integer.parseInt(st.nextToken());
        int productPrice = Integer.parseInt(st.nextToken());

        if (productPrice <= workerPrice) System.out.println("-1");
        else System.out.println((lockedPrice / (productPrice - workerPrice)) + 1);
    }
}