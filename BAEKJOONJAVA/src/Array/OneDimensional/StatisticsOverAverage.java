package JAVA.Array.OneDimensional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StatisticsOverAverage{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int testCase = Integer.parseInt(br.readLine());
	StringTokenizer st;
	int[] arr;
	double sum = 0;
	
	for(int i = 1 ; i <= testCase ; i++){
	    st = new StringTokenizer(br.readLine()," ");
	    int studentNum = Integer.parseInt(st.nextToken());
	    arr = new int[studentNum];
	    for(int j = 0 ; j < studentNum ; j++){
		arr[j] = Integer.parseInt(st.nextToken());
		sum += arr[j];
	    }
	    double average = (sum / studentNum);
	    double cnt = 0;
	    for(int j = 0 ; j < studentNum ; j++){
		if(arr[j] > average) {
		    cnt++;
		}
	    }
	    bw.write(String.format("%.3f",(cnt / studentNum)*100) + "%\n");
	    sum = 0;
	}
	bw.flush();
	bw.close();
    }
}
