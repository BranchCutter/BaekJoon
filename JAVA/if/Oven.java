import java.util.Scanner;

public class Oven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt() + scanner.nextInt();
        scanner.close();

        while (minute >= 60) {
            hour++;
            minute -= 60;
        }
        if (hour > 23) hour -= 24;
        System.out.println(hour + " " + minute);
    }
}