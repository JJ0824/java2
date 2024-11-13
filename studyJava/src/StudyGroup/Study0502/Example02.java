package StudyGroup.Study0502;

import java.util.Arrays;

// [배열간 크기비교]
// 두개의 배열을 각 인덱스 별로 비교하여 큰 값을 저장한 새로운 배열을 만들어 출력하시오.
public class Example02 {
    public static void main(String[] args) {
      int[] str1 = new int[]{56,74,65,24,96,85,45,65,55,54};
      int[] str2 = new int[]{24,58,78,54,15,62,54,12,47,85};

      int[] str3 = new int[10];

        for (int i = 0; i <str1.length; i++) {
            if (str1[i] > str2[i]) {
                str3[i] = str1[i];
            } else  {
                str3[i] = str2[i];
            }
        }
        System.out.println(Arrays.toString(str3));
    }
}
