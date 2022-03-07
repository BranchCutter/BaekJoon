package For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SmallerThenX{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	String str = br.readLine();
	String[] arr = str.split(" ");
	int N = Integer.parseInt(arr[0]);
	int X = Integer.parseInt(arr[1]);

	String sequenceStr = br.readLine();
	st = new StringTokenizer(sequenceStr, " ");
	String[] sequence = new String[N];
	int[] integerSequence = new int[N];
	int num = 0;
	
	while(st.hasMoreTokens()){
	    sequence[num] = st.nextToken();
	    integerSequence[num] = Integer.parseInt(sequence[num]);
	    num++;
	}

	for(int i = 0; i < integerSequence.length; i++) {
	    if (integerSequence[i] < X) bw.write(integerSequence[i] + " ");
	}
	bw.flush();
	bw.close();
    }
}
