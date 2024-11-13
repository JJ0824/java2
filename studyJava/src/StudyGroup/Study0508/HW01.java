package StudyGroup.Study0508;
//복권 당첨 확인 프로그램 만들기
/*
프로그램에는 랜덤으로 생성되는 값 = 당첨 번호가 존재 하며(6개의 숫자), Scanner로부터 6개의 값 입력
유저가 값 6개를 입력한다.    Scanner 입력

조건.
(당첨 번호 끼리는 서로 값이 중복 되지 않아야 한다.)
1등 = 6개 모두 일치
2등 = 5개 일치
3등 = 4개 일치
나머지는 모두 꽝

//난수 생성법
Random rd = new Random();
        int randNum = rd.nextInt(10)+1; // 0 부터 입력한 (정수값-1) 범위에서 랜덤
 */
//1. 프로그램을 설계하시오.
//2. 코드를 작성하시오.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    1.로또 당첨 프로그램을 만들기 위해 6개의 당첨번호를 저장 할 6개의 크기의 새로운 배열을 만든다
    1-2. 1번에서 만든 배열에 6개의 중복되지 않는 난수 생성 한다(난수를 배열에 대입) 난수 생성을 할때
     로또번호 1~45까지의 숫자를 나타내야 하기 위해 (45)+1을 해준다

    2.유저에게 값을 입력받기 위해 Scnner 를 쓴다(한번 선언하고 6개의 값을 받는 코드를 작성)
    2-1.유저에게 입력받은 6개의 값이 저장되는 새로운 배열을 만든다.(6개의 값을 받는 코드를 작성)
    2-2.반복문과 스캐너를 이용해서 2-1에 만든 배열에 6개의 값을 넣어준다 당첨자를 가려내는것

    3.당첨결과를 확인하는 코드를 짠다.
    3-1.숫자확인 당첨숫자랑 내가 뽑은 숫자를 비교한다.
    3-2.6개 모두 동일할시 1등,5개가 모두 동일할시 2등, 4개가 모두 동일할시 3등,나머지는 모두 꽝
    이라는 조건을 달아준다.
    4. count 를 사용하여 횟수로 등수를 나타내는 코드를 짠다. count 필요

      로또 당첨번호와(num) 유저가 입력한 번호(배열 numsix )가 일치할 때

 */
public class HW01 {
    public static void main(String[] args) {
        int[] num = new int[6]; // 1번. 6개의 당첨번호를 저장 할 6개의 크기의 새로운 배열

        Random rd1 = new Random();

        System.out.println("로또 추첨을 시작하겠습니다 1~45까지의 숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in); //2번. 유저에게 값을 입력받기위한 메세지 출력

        int[] numsix = new int[6];  //2-1번. 유저에게 입력받은 6개의 값이 저장되는 새로운 배열

        int count = 0; // 번호 개수 카운트

        System.out.println(Arrays.toString(numsix));
        for (int i = 0; i < num.length; i++) {       // 6개의 난수를 저장 하는 반복문을 만든다 (당첨번호)
            num[i] = rd1.nextInt(45) + 1;   //1-2번. 1부터 45까지(46미만)의 난수 생성
        }

        for (int i = 0; i < numsix.length; i++) {
            System.out.println((i + 1) + "번째 값을 입력해주세요");
            numsix[i] = sc.nextInt();  // 2-2번. 반복문을 이용해서 사용자에게 입력받은 6개의 값을 6개의 크기의 배열에 저장한다
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < numsix.length; j++) {
                if (num[i] == numsix[i]) {     // num[i] 당첨번호 와 numsix[i] 사용자가 입력한 값과 같으면 +1씩 증가 숫자를 셈
                    count++;
                    break; // 중복된 숫자를 피하기위해 씀
                }
            }
            if (num[i] == numsix[i]) { // num[i] 당첨번호 와 numsix[i] 사용자가 입력한 값과 같다면 1등
                System.out.println("축하드립니다 1등입니다.");
            } else if (count == 5) {   // num[i] 당첨번호 와 numsix[i] 사용자가 입력한 값과 5개가 같으면 2등
                System.out.println("축하드립니다 2등입니다.");
            } else if (count == 4) {   // num[i] 당첨번호 와 numsix[i] 사용자가 입력한 값과 4개가 같으면 3등
                System.out.println("축하드립니다 3등입니다.");
            } else {                    // num[i] 당첨번호 와 numsix[i] 사용자가 입력한 값과 4개이상 틀리면 꽝
                System.out.println("꽝입니다 다음기회에..");
            }
        }

    }
}