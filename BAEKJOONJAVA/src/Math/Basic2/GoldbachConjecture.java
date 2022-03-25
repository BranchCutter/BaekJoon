package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachConjecture {

    public static boolean[] prime = new boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        get_prime();

        while (testCase-- > 0) {

            int evenNum = Integer.parseInt(br.readLine());
            int firstPrime = evenNum / 2;
            int secondPrime = evenNum / 2;

            while (true) {

                if (!prime[firstPrime] && !prime[secondPrime]) {
                    sb.append(firstPrime).append(" ").append(secondPrime).append("\n");
                    break;
                }

                firstPrime--;
                secondPrime++;
            }
        }
        System.out.print(sb);
    }

    public static void get_prime() {

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {

            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) { prime[j] = true; }
        }
    }
}
