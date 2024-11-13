package StudyGroup.Study0403;

import java.lang.reflect.Array;
import java.util.Arrays;

//ArrayBirthDay 라는 배열 하나로
//1.   1,2,3,4,5,6,7,8,9,10
//2.   10,20,30,40,50,60,70,80,90,100
//3.   15,25,35,45,55,65,75,85,95,105
//4.   99,99,99,99,99,99,99,99,99,99
//를 출력하시오.
// Arrays.toString() 메서드는 배열의 내용을 문자열로 변환하여 반환하는 메서드
// Arrays.toString() 메서드를 사용하면 간편하게 배열의 내용을 출력할 수 있다

public class HW02 {
    public static void main(String[] args) {

        int[] ArrayBirthDay = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

        System.out.println(Arrays.toString(ArrayBirthDay)); // 배열의 내용을 문자열로 변환하여 배열의 내용을 출력
        for(int i=0;i< ArrayBirthDay.length;i++){    // i가  ArrayBirthDay 보다 작으면 +1씩 증가
            ArrayBirthDay[i] = ArrayBirthDay[i]*10;   // 배열 ArrayBirthDay의 i번째 행의 모든 요소들의 값을10배로 만드는 코드
        }
        System.out.println(Arrays.toString(ArrayBirthDay));   // 10배로 만든 값을 출력

        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = ArrayBirthDay[i]+5;   // 배열 ArrayBirthDay의 i번째 행의 모든 요소들을 값을 각 +5씩 만드는 코드
        }
        System.out.println(Arrays.toString(ArrayBirthDay));   // +5씩 만든 값을 출력

        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = 99;                     // 배열  ArrayBirthDay의 모든 값이 99로 바뀐다
        }
        System.out.println(Arrays.toString(ArrayBirthDay));  // 99로 바뀐 값 출력
    }
}
