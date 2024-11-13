package StudyGroup.Study0405;

//arraySort 배열엔 {2,50,14,2,74,12,57,42,1,78,63,59,27} 이 저장되어있다.
//배열 속 숫자들을 작은 순서부터 나열 하시오.

import java.util.Arrays;
import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        int[] arraySort = new int[]{2, 50, 14, 2, 74, 12, 57, 42, 1, 78, 63, 59, 27};

        Arrays.sort(arraySort);

        for (int i=0; i<arraySort.length; i++) {
            System.out.println(arraySort[i]);
        }
    }
}

