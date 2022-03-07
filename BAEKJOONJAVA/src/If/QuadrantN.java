package If;

import java.util.Scanner;

public class QuadrantN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        if(X > 0) {
            if(Y > 0) System.out.print("1");
            else System.out.print("4");
        } else {
            if(Y > 0) System.out.print("2");
            else System.out.print("3");
        }
    }
}
