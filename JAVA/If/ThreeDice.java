package JAVA.If;

import java.util.Scanner;

public class ThreeDice{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int max = a;
        if (a == b && b == c) {
            System.out.println(10000 + (max * 1000));
        } else if(a != b && b != c && a != c) {
            if (max < b) max = b;
            if (max < c) max = c;
            System.out.println(max * 100);
        } else {
            if (a != b) System.out.println(1000 + (c * 100));
            else System.out.println(1000 + (b * 100));
        }
    }
}
