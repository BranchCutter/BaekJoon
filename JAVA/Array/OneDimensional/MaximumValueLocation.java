import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumValueLocation{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int[] arr = new int[9];
	int max = 0, index = 0, cnt = 0;
	
	for(int i = 0; i < 9; i++){
	    arr[i] = Integer.parseInt(br.readLine());
	}
	
	for(int value : arr) {
	    cnt++;
	    if(value > max) {
		max = value;
		index = cnt;
	    }
	}
	System.out.println(max + "\n" + index);
    }
}
