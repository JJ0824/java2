package StudyGroup.Study0426;

import java.util.Scanner;

//유저가 숫자를 입력하면 그 숫자에 해당 하는 한글을 출력하는 코드를 작성하시오.
// 범위는 1부터 5까지이며 범위를 초과시 error 를 출력.
// ex) 유저 1 입력 = 일 출력
public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 5까지 숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 5) {
            switch (num) {
                case (1):
                    System.out.println("일");
                    break;

                case (2):
                    System.out.println("이");
                    break;

                case (3):
                    System.out.println("삼");
                    break;

                case (4):
                    System.out.println("사");
                    break;

                case (5):
                    System.out.println("오");
                    break;
                }
            } else{
            System.out.println("범위를 초과하셨습니다: error");
        }
    }
}
