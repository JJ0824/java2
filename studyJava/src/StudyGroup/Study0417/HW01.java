package StudyGroup.Study0417;

import java.util.Scanner;

// 사용자로부터 입력받은 n단까지의 구구단을출력하는 코드를 작성하시오.
public class HW01 {
    public static void main(String[] args) {

        System.out.println("몇단까지 알고싶은지 숫자를 쓰시오: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;

        for (int i = 1; ; i++) {
            if (i > num) {
                break;
            } else {
                for (int j = 1; j < 10; j++) {
                    a = i * j;
                    System.out.print(a + " ");
                }
            }System.out.println();
        }
    }
}