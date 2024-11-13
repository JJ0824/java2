package StudyGroup.Study0418;

import java.util.Arrays;

/*
{88,45,22,12,71,41,34,57,41} 값을 저장하고 있는 배열이 있다.
다음을 나타내시오.
1. 총 합
2. 짝수 숫자들의 합
3. 홀 수만 뽑아 저장한 새로운 배열
 */
public class HW04 {
    public static void main(String[] args) {

        int[] num = new int[] {88,45,22,12,71,41,34,57,41};

        int sum = 0;
        for (int i=0; i<num.length; i++){
            sum = sum + num[i];
        }System.out.println("총 합: " + sum);

        int sum1 =0;
        sum1 = num[0] + num[2] + num[3] + num[6];
        System.out.println("짝수들의 합: " + sum1);


        for (int i=0; i<num.length; i++) {
            if (i / 2 == 1) {
                num[i] = i;

            }
        }

        // 내일 다시풀기







    }
}
