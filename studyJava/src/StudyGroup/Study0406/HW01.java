package StudyGroup.Study0406;


import java.util.Arrays;
import java.util.Scanner;

// 1. 사용자에게 입력받은 숫자 10개를 저장하는 코드를 작성하시오

// Scanner scanner = new Scanner(System.in);
// System.out.print("정수를 입력하세요: ");

// int number = scanner.nextInt();
// System.out.println("입력된 정수: " + number);
public class HW01 {
    public static void main(String[] args) {

        int[] number = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 숫자 10개중 하나를 입력 하세요  : ");

        int num = scanner.nextInt();
        System.out.println("사용자에게 입력 받은 숫자 : ");

        for (int i=0; i<number.length; i++) {

            number[i] = scanner.nextInt();
            System.out.println("숫자" + i + ":");
        }










    }
}
