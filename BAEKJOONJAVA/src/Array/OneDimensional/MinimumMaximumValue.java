package JAVA.Array.OneDimensional;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumMaximumValue{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	int[] arr = new int[n];
	for (int i = 0; i <= n-1; i++){
	    arr[i] = Integer.parseInt(st.nextToken());
	}
	Arrays.sort(arr);
	System.out.println(arr[0] + " " + arr[n-1]);
    }
}
