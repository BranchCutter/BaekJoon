package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RepeatString{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			for(int j = 0; j < S.length(); j++){
				for(int k = 0; k < R; k++) { bw.write(S.charAt(j)); }
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
			
