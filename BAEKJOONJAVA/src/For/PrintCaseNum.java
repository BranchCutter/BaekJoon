package JAVA.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrintCaseNum{
    public static void main(String[] args)throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int t = Integer.parseInt(bf.readLine());
	StringTokenizer st;
	
	for(int i = 1; i <= t; i++){
	    st = new StringTokenizer(bf.readLine());
	    bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
	}
	bw.flush();
	bw.close();
    }
}
