import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OXTestCase{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int testCase = Integer.parseInt(br.readLine());
	
	String[] arr = new String[testCase];
	for(int i = 0 ; i < testCase ; i++){
	    arr[i] = br.readLine();
	}
	int cnt = 0, score = 0;
	char c = 'X';
	for(String value : arr){
	    for(int j = 0 ; j < value.length() ; j++){
		c = value.charAt(j);
		if(c == 'O'){
		    cnt++;
		    score += cnt;
		} else {
		    cnt = 0;
		}
	    }
	    bw.write(score + "\n");
	    score = 0;
	    cnt = 0;
	}
	bw.flush();
	bw.close();
    }
}
