import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(low + " * " + " = " + (low*i));
        }
    }
}