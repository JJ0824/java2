package StudyGroup.Study0418;
//길이가 5인 배열과 길이가 6인 배열을 만든다.


//0~9까지의 숫자 중 한쪽에는 짝수, 한쪽애는 홀 수가 저장되도록 한다

import java.util.Arrays;
public class HW03 {
    public static void main(String[] args) {
        int[] array = new int[] {5};
        int[] array1 = new int[] {6};

        for (int i=0; i<array.length; i++){
            if ( i % 2 == 1) {
               array1[i] = i;
            }System.out.println(array[i]);
        }

        // 내일 풀기
    }
}
