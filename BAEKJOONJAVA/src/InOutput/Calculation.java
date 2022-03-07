package InOutput;

// Question : Two natural numbers A and B are given.
// Write a program that outputs A+B, A-B, A*B, A/B, and A%B. (BAEKJOON 10869)
// Input : Two natural numbers A and B are given. (1 ≤ A, B ≤ 10,000)
// Output : Let A+B, A-B, A*B, A/B, and A%B be sequentially output over five lines.
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A, B;

        A = scanner.nextInt();
        B = scanner.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        scanner.close();
    }
}
