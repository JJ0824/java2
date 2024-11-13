package StudyGroup.Study0419;

import java.util.Arrays;
import java.util.Scanner;

// Z배열에는 {1,2,3,4,5,6,7,8,9,10}이 저장되어있다
// 배열의 각 요소를 제곱하고, 새로운 배열에 저장한 후 결과를 출력하는 프로그램을 작성하시오.
public class EX03 {
    public static void main(String[] args) {

        int[] z = new int[] {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<z.length; i++) {

          // z[i] = i=2;  첫번째 시도했던 방법 [0, 2, 4, 6, 8, 10, 12, 14, 16, 18] 값 출력
                          // z의 현재 i번째 인덱스를 i * 2로 변경

          z[i]= z[i]*2;   // 인덱스의 i 번째 값에 2를 곱해줌 [2, 4, 6, 8, 10, 12, 14, 16, 18, 20] 출력
                          // z의 현재 i번째 인덱스의 값을 2배로 만들어서 다시 i번째 인덱스에 저장
        }
        System.out.println(Arrays.toString(z));
    }   //[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]  , [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
}
