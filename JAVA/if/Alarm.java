import java.util.Scanner;

public class Alarm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        if(minute < 45){
            System.out.println(hour);
            System.out.println()
        }
    }
}
