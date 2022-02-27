import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCount{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int A = Integer.parseInt(br.readLine());
	int B = Integer.parseInt(br.readLine());
	int C = Integer.parseInt(br.readLine());

	int timesValue = A * B * C;
	int valueLength = (int)(Math.log10(timesValue)+1);
	int[] arr = new int[10];
	int index;

	for(int i = 0; i < valueLength; i++){
	    index = timesValue % 10;
	    arr[index]++;
	    timesValue = timesValue / 10;
	}
	for(int value : arr){
	    System.out.println(value);
	}
    }
}
