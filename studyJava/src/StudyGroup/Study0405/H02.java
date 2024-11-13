package StudyGroup.Study0405;

import java.util.Scanner;

//배열 arrayCheck 에는 1부터 10까지의 숫자가 들어있고 //
//사용자에게 1부터 10까지 숫자중 임의의 숫자 5개를 입력받는다.(중복 숫자 가능)
//사용자가 입력한 숫자들과 배열 arrayCheck 중 동일한 숫자를 찾고 그 수가 중복 된다면 중복된 횟수를 출력하라

// 1. arrayChek라는 변수이름의 배열안에 1부터 10까지의 길이의 배열을 만들어라.
// 2. 사용자엑 임의의 숫자를 입력 받기위해 Scanner를 사용한다
// 3.
public class H02 {
    public static void main(String[] args) {

        int[] arrayCheck = new int[10];
        int[] arrayCheck2 = new int[5];

        System.out.println("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
                int num1 = scanner.nextInt();


        System.out.println("동일한 숫자 : ");
        Scanner sc = new Scanner(System.in);
        int num2 = scanner.nextInt(5);









    }
}
