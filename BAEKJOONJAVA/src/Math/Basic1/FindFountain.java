package JAVA.Math.Basic1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindFountain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int crossCount = 1, previousCountSum = 0;
        boolean condition = true;

        while(condition){

            if (X <= previousCountSum + crossCount) {

                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (X - previousCountSum - 1) + "/" + (X - previousCountSum)));
                    condition = false;
                }

                else {
                    System.out.println((X - previousCountSum) + "/" + (crossCount - (X - previousCountSum - 1)));
                    condition = false;
                }

            }

            else {
                previousCountSum += crossCount;
                crossCount++;
            }

        } 
    }
}
