package JAVA.If;

import java.util.Scanner;

public class ComapreTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (A < B) {
            System.out.println("<");
        } else if (A > B) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}