import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PreciseCaseNum{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	String[] arr = new String[2];
	int test = Integer.parseInt(br.readLine());
	for(int i = 1; i <= test; i++){
	    st = new StringTokenizer(br.readLine());
	    arr[0] = st.nextToken();
	    arr[1] = st.nextToken();
	    bw.write("Case #" + i + ": " + arr[0] + " + "+arr[1]);
	    bw.write(" = " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) + "\n");
	}
	bw.flush();
	bw.close();
    }
}
