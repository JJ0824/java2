package StudyGroup.Study0523;

import java.util.Scanner;

/*
[은행어플]
1. 내 통장 잔고를 확인하는 메서드 구현
2. 출금 요청이 왔을때 출금하는 메서드 구현
3. 입금 요청이 왔을때 입금하는 메서드 구현
4. 송금 요청이 왔을때 송금하는 메서드 구현
*/
public class HW01 {
    public static void main(String[] args) {
        int myMoney = 1000; // 내 통장 잔고
        int youMoney = 5000; // 송금

        // 내 통장 잔고
        Money money = new Money();
        int bankmoney = money.myMoney(myMoney);
        System.out.println("현재 통장 잔고: " + bankmoney + "원"); // 확인을 위한 출력 코드

        // 사용자 입력한 출금 액수
        Scanner scanner = new Scanner(System.in);
        System.out.println("출금 하고 싶은 금액을 입력하세요."); // 확인을 위한 출력 코드
        int minusnum = scanner.nextInt();

        // 출금
        int bankminus = money.moneyMinus(minusnum);
        System.out.println("출금 후 남은 금액: " + bankminus + "원"); // 확인을 위한 출력 코드

        // 사용자가 입력한 입금 액수
        System.out.println("입금 할 액수를 입력하세요.");
        int plusnum = scanner.nextInt();
        // 입금
        int deposit = money.plusMoney(plusnum);
        System.out.println(deposit);










        //3번 메서드 실행 -> 5000원 입금해주세요.
        //1번 메서드 실행
        //2번 메서드 실행 -> 3000원 출금해주세요.
        //1번 메서드 실행
        //4번 메서드 실행 -> 1500원 송금해주세요.
        //1번 메서드 실행
    }
}