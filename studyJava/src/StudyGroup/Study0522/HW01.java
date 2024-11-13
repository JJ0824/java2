package StudyGroup.Study0522;

import java.util.Scanner;

// 공통 조건 : 3개의 과제 클래스에서 필요한 외부 클래스는 하나의 클래스 NumberForHw로 통일하여 사용
public class HW01 {
    //유저에게 두 개의 숫자를 입력받아 사칙연산을 수행하시오.
    //4개의 사칙연산을 따로따로 모두 실행하시오.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 덧셈
        NumberForHw number = new NumberForHw();
        int plusNum = number.plusNum(num1,num2);
        System.out.println(plusNum);

        //뺄셈
        int minusNum = number.minusNum(num1,num2);
        System.out.println(minusNum);

        //곱셈
        int multnum = number.multNum(num1,num2);
        System.out.println(multnum);

        //나눗셈
        int divinum = number.divisionNum(num1,num2);
        System.out.println(divinum);
    }
}