package StudyGroup.Study0517;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //사용자에게 두 개의 숫자를 입력받아 다음을 수행하는 메서드를 만드시오.
        //단 외부 클래스를 사용해야 함. -> 새로운 file 이용
        //1. 두 수를 더하는 메서드를 만드시오.
        //2. 두 수를 빼는 메서드를 만드시오.
        //3. 1과 2를 더하는 메서드를 만드시오.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //1. 두 수를 더하는 메서드를 만드시오.
        Number num = new Number();
        int a = num.plusNum(num1,num2);
        //2. 두 수를 빼는 메서드를 만드시오.
        int b = num.subNum(num1 , num2);
        //3. 1과 2를 더하는 메서드를 만드시오.
        int c = num.sumNum(a , b);
    }
}












