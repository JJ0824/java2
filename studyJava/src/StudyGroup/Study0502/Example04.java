package StudyGroup.Study0502;

import java.util.Random;
import java.util.Scanner;

//[숫자 맞추기 게임]
//사용자에게 랜덤한 숫자를 맞추게 하는 간단한 숫자 맞추기 게임 코드를 작성하시오.
// 출력 할 것 : 1. 시도한 횟수, 2. 맞춘 숫자

/* 컴퓨터는 1부터 100까지의 랜덤한 숫자를 선택하고, 사용자는 이 숫자를 맞추기 위해 반복적으로 추측합니다.
프로그램은 사용자의 추측에 따라 높거나 낮은지를 알려주고, 숫자를 맞추면 축하 메시지를 출력합니다.
사용자가 입력한 값이 비교값(랜덤으로 지정한 값)  보다 작으면 [오답입니다. 더 큰수를 입력하시오],
 크면[오답입니다. 더 작은 수를 입력하시오] 등과 같은 코맨트를 남기고   숫자가 일치 할 시 축하메시지와 함께 그 수와,
 시도했던 카운트를 같이 출력한다.
 */
/*
/*
 */
public class Example04 {
    public static void main(String[] args) {

         // 1부터 100까지 랜덤한 숫자 생성

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        //이후부터 코드 작성
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100 까지의 숫자중 원하는 숫자를 입력하세요: ");
        int count = 0;

        for (int i = 0; ; i++) {
            int scNum = scanner.nextInt(); // for문 밖에 써주면 게임이 다시 시작될때 변수가 초기화 되지않아서 이전 입력값을 유지하게됨
            count++;

            if (scNum < randomNumber) {
                System.out.println("오답입니다. 더 큰 수를 입력하시오");
            } else if (scNum > randomNumber) {
                System.out.println("오답입니다. 더 작은 수를 입력하시오");
            }
            else {
                System.out.println("맞춘 숫자: " + randomNumber);
                System.out.println("축하드립니다! 숫자가 일치합니다");
                System.out.println("시도한 횟수: " + count);

                break;
            }

        }

    }
}
