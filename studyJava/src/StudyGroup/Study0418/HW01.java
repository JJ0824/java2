package StudyGroup.Study0418;

import java.util.Arrays;

// 1. {0,1,2,3,4,5,6,7,8,9}값이 들어있는 배열을 만드시오
// 2. 본인의 (이름),(나이),(성별),(키) 정보가 들어있는 배열을 만드시오.
// 3. 0부터 99까지의 수가 저장되는 배열을 만드시오.
public class HW01 {
    public static void main(String[] args) {
      //  int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};

       // String[] str = new String[]{"홍성규","31","남","171cm"};

       // System.out.println(Arrays.toString(str));

        int[] array1 = new int[100];

        for (int i=0; i<array1.length; i++) {

            array1[i] = i;

            System.out.println(array1[i]);
        }
    }
}
