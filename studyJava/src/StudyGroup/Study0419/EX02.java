package StudyGroup.Study0419;

import java.util.Scanner;

// 사용자에게 배열의 길이를 입력 받고
// 그 배열에 1부터 100까지 중 짝수의 숫자만 앞에서부터 넣으시오.
// 예 )) 길이가 3이면 배열 안에는 2,4,6저장된다.
public class EX02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 사용자에게 입력을 받는 코드
        System.out.println("배열의 길이를 입력하세요: ");  // 사용자에게 출력되는 코드

        int length = sc.nextInt();  // 사용자로부터 정수 값을 입력받는 코드
        int[] array = new int[length];  // 새로운 배열을 만들고 length에 있는 값을 array에 대입시키는 코드

        for (int i=0; i<array.length; i++) { // i가 array보다 작으면 +1씩 증가시킨다
            if (i % 2==0) { // i번째 인덱스의 값이 짝수일때의 조건
                array[i] = i*2;   // i값을 array의 인덱스 값에 대입

            }System.out.println("배열의 길이는 "  +  array[i] + "입니다."); // 결과값이 0 0 2 가 출력 되는 이유를 모르겠음...
        }
    }
}
