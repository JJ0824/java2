package StudyGroup.Study0502;

import java.util.Arrays;
import java.util.Scanner;

//[배열의 최대값과 최소값 찾기]
//배열의 최대값과 최소값을 찾는 프로그램을 작성하시오.

/* 최대값 = 최대값을 저장하는 변수(자기 자신)과 비교대상(str1의[i] 번째인덱스 - 반복)를 비교했을때
비교 대상보다 자기자신이 크다면 자신이 최대값인것이므로 아무 행동이 없지만 비교 대상이 더 클경우
비교 대상이 최대값이므로 비교대상을 자신에게 업데이트(대입) 한다.

최소값은 크와 반대 개념 */
public class Example01 {
    public static void main(String[] args) {
       int[] str1=new int[] {100,54,6,78,98,74,85,65,24,26};

       int max = Integer.MIN_VALUE;
       int mun = Integer.MAX_VALUE;


        for (int i = 0; i <str1.length; i++) {
            if (max <str1[i]) {
                max = str1[i];
            }
            if (mun > str1[i]) {
                mun =  str1[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + mun);
    }
}
