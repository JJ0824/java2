package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[10]; // 숫자를 저장할 배열 선언

        Scanner scanner = new Scanner(System.in); // 사용자에게 입력받는 코드
        System.out.println("숫자 10개를 입력하세요:"); // 사용자에게 출력되는 코드

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("숫자 " + (i + 1) + ": ");

            numbers[i] = scanner.nextInt();
        }
        System.out.println("사용자에게 입력받은 숫자:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
