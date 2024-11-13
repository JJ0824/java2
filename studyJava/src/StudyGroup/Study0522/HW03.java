package StudyGroup.Study0522;

import com.sun.jdi.Value;

import java.util.Scanner;

// 공통 조건 : 3개의 과제 클래스에서 필요한 외부 클래스는 하나의 클래스 NumberForHw로 통일하여 사용
public class HW03 {
    //유저에게 10개의 정수형 데이터를 입력받아 최소값과 최대값을 찾는 코드를 작성하시오.
    //최소값과 최대값을 구하는 메서드를 각각 만드시오.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNum = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < inputNum.length; i++) {
            inputNum[i] = scanner.nextInt();

            if (inputNum[i] < min) {
                min = inputNum[i];
            }if (inputNum[i] > max){
                max = inputNum[i];
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);


    }
}