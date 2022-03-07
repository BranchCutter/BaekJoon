package JAVA.InOutput;

// Question : Take the two integers A and B
//            and write a program that outputs A/B. (BAEKJOON 1008)
// Input : A and B are given in the first line. (0 < A, B < 10)
// Output : Output A/B on the first line.
//          If the absolute error or relative error between the actual correct answer
//          and the output value is 10-9 or less,
//          it is the correct answer.
import java.util.Scanner;

public class Divide {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double A, B;
        
        A = scanner.nextDouble();
        B = scanner.nextDouble();

        System.out.println(A/B);
        scanner.close();
    }
}