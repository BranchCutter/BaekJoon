package Math.Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RecursiveFuction {

    static StringBuilder sb = new StringBuilder();

    public static void recursive(int cnt) {
        if(cnt == 0) {

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int n = cnt;
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursive(cnt);
    }
}
