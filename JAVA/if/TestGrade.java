import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int grade;
        
        grade = scanner.nextInt();
        if(grade >= 90) { // 100 이상일 시 컴파일 에러 발생(백준상), 90이상으로 수정
            System.out.println("A");
        } else if(grade<90 && grade >=80){
            System.out.println("B");
        } else if(grade<80 && grade >= 70){
            System.out.println("C");
        } else if(grade<70 && grade >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        scanner.close();
    }
    
}
