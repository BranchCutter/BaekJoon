package JAVA.While;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class WhileTestCase0{
    public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	int[] arr = new int[2];

	while(true){
	    st = new StringTokenizer(br.readLine());
	    arr[0] = Integer.parseInt(st.nextToken());
	    arr[1] = Integer.parseInt(st.nextToken());
	    if(arr[0] == 0 && arr[1] == 0) break;
	    bw.write((arr[0] + arr[1]) + "\n");
	}
	bw.flush();
	bw.close();
    }
}	
