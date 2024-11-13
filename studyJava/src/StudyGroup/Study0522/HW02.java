
package StudyGroup.Study0522;

import java.util.Scanner;

// 공통 조건 : 3개의 과제 클래스에서 필요한 외부 클래스는 하나의 클래스 NumberForHw로 통일하여 사용
public class HW02 {
    //사용자에게 입력받은 숫자가 1의 자리인지 10의 자리인지 100의 자리인지 알아내는 코드를 작성하시오.
    //입력매게변수 사용
    // 배열이 필요가없고 for문도 필요가 없다 (반복을 안하기떄문에)
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
            if (a < 10) {
                System.out.println("1의 자리 숫자입니다.");
            } else if (a <= 99) {
                System.out.println("10의 자리 숫자입니다.");
            } else if (a <= 999) {
                System.out.println("100의 자리 숫자입니다.");
            } else{
                System.out.println("범위를 벗어났습니다.");
            }


    }
}
