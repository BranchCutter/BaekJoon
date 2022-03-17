package Math.Basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BertrandPostulate {

    public static boolean[] prime = new boolean[246913];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        get_prime();
        while(true) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;

            if(N == 0) break;

            for(int i = N + 1; i <= 2 * N; i++) {
                if(!prime[i]) cnt++;
            }

            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }

    public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
    
    }

}
