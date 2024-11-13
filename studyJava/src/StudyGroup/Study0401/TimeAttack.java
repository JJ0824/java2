package StudyGroup.Study0401;

import java.util.Scanner;

//사용자에게 1~10까지의 수 중 하나를 입력받는다.
//(조건1. 입력받은 값이 1~10의 범위를 넘어간 경우 Error 출력)
//사용자가 입력한 값을 userInput으로 받은 뒤
//그 수가 짝수인 경우 입력 받은 수 부터 10까지의 숫자를 모두 더한 값을 출력하고,
//사용자가 입력한 값이 홀 수 인 경우
//입력 받은 수부터 10까지의 숫자를 모두 곱한 값을 출력하고,
//그 숫자가 홀수인지 짝수 인지 출력하는 코드를 짜시오.
//조건2. 계산 결과값이
//100보다 클 경우 "결과값은 100보다 큰 수 입니다"
//100과 같을 경우 "결과값은 100과 동일합니다."
//작을 경우 "결과값은 100보다 작은 수 입니다." 를 출력하시오.
public class TimeAttack {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        System.out.println("1~10 까지의 수 중 하나를 입력하시오");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if(userInput>=1 && userInput<=10) {
            if (userInput % 2 == 0) {
                System.out.println("짝수 입니다");
                for (int i = userInput; i <= 10; i++) {
                    sum = sum + i;
                }
                String str = (sum>100) ? "결과값은 100보다 큰 수 입니다" : (sum==100) ? "결과값은 100과 동일 합니다" : "결과값은 100보다 작은 수 입니다";
                System.out.println("덧셈의 총 합은 : " + sum);
                System.out.println(str);
            } else {
                System.out.println("홀수 입니다");
                for (int j = userInput; j <= 10; j++) {
                    mul = mul * j;
                }
                String str = (mul>100) ? "결과값은 100보다 큰 수 입니다" : (mul==100) ? "결과값은 100과 동일 합니다" : "결과값은 100보다 작은 수 입니다";
                System.out.println("곱셈의 총 합은 : " + mul);
                System.out.println(str);
            }
        }
        else {
            System.out.println("Error");
        }
    }
}

