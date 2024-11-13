package StudyGroup.Study0513;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        //계산기 구현

        //사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 해당 연산을 수행하는 코드를 작성하시오.
        //조건. 4가지의 연산자가 아닌 경우 다시 입력닫도록 설계하고
        //프로그램의 종료는 사용자가 '종료'라고 입력해야지만 가능하도록 코드를 작성

        /* 1. 사용자로부터 연산자와 숫자를 입력받고 다음

           2. 연산자를 입력받아 해당 연산을 수행하는 코드를 실행하기 위해

           만약에 사용자가 입력한게 +면 +를 입력하고 -면 -를 하는 동작을
// 이퀄스를쓴다 사용자가 입력한 연산자의 변수를 스트링이랑
 // 만약 string이 "+"와 동일하다면, a와 b를 더한 값을 result에 저장하고, 그 값을 출력

(연산자가 저장된 변수).equalsIgnoreCase("+")
         */

        Scanner scanner = new Scanner(System.in);
        double result = 0;
        for (int i=0; ; i++) {
            System.out.println("+, -, *, / 중 원하는 연산자를 입력해주세요");
            Scanner scanner1 = new Scanner(System.in);
            String string = scanner1.nextLine();
            if (string.equals("종료")) {
                break;
            } else if (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/")){
                System.out.println("첫번째 숫자를 입력해 주세요");
                double a = scanner.nextInt();
                System.out.println("두번째 숫자를 입력해 주세요");
                double b = scanner.nextInt();
                if (string.equals("+")) {
                    result = a + b;
                    System.out.println(result);
                    break;
                } else if (string.equals("-")) {
                    result = a - b;
                    System.out.println(result);
                    break;
                } else if (string.equals("*")) {
                    result = a * b;
                    System.out.println(result);
                    break;
                } else if (string.equals("/")) {
                    result = a / b;
                    System.out.println(result);
                    break;
                }
            }
        }

    }
}