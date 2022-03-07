package InOutput;

import java.util.Scanner;

public class BuddhistYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;

        year = scanner.nextInt();
        System.out.println(year-543);
        scanner.close();
    }
}
