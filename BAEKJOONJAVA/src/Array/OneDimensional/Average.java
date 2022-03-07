package JAVA.Array.OneDimensional;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	double[] arr = new double[Integer.parseInt(br.readLine())];
	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
	double sumedValue = 0;

	for(int i = 0 ; i < arr.length ; i++){
	    arr[i] = Double.parseDouble(st.nextToken());
	}
	Arrays.sort(arr);
	
	for(double value : arr){
	    sumedValue += ((value / arr[arr.length - 1]) * 100);
	}

	System.out.println(sumedValue / arr.length);
    }
}
