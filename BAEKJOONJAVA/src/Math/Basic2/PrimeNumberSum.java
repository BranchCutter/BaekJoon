package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minimum = Integer.parseInt(br.readLine());
        int maximum = Integer.parseInt(br.readLine());

        int primeSum = 0;
        int minimumPrimeValue = Integer.MAX_VALUE;

        for (int i = minimum; i <= maximum; i++) {
            if (isPrime(i) == true) {
                primeSum += i;

                if (minimumPrimeValue == Integer.MAX_VALUE)
                    minimumPrimeValue = i;
            }
        }

        if (primeSum == 0)
            System.out.println(-1);

        else
            System.out.println(primeSum + "\n" + minimumPrimeValue);
    }

    public static boolean isPrime(int num) {
        if (num == 0)
            return false;
        else if (num == 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

}