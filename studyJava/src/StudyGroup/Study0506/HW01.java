package StudyGroup.Study0506;

import java.util.Arrays;

//array[54,87,14,25,97,5,41,4,627,85,41,365]
//위 배열을 작은 수부터 큰 순으로 정렬하시오.
//문제 1. 위 배열을 정렬하는 플로우 차트를 작성하시오(주석처리)
//문제 2. 정렬된 배열과 최소,최대 값 그리고 최소값부터 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스를 구한 뒤 출력하시오.
public class HW01 {
    public static void main(String[] args) {

        /*플로우 차트
        1.array 라는 변수 이름을 만든다
        2.array 변수안에 [54,87,14,25,97,5,41,4,627,85,41,365] 만큼의 길이의 새로운 배열을 저장(대입)한다.
        3.배열을 작은 수 부터 큰 순으로 정렬 하기위해 sort 메서드를 사용한다(예전에 사용해봤지만 배열정렬 하는방법이 기억이 안나서 정렬하는 메서드 검색해봄)
        4.정렬된 배열안의 [0]번째 자리는 최소값인 4 이고 [11]번째 자리는 최대값인 627 이다
        5.최소값부터 값을 차례대로 더했을 때 1445가 나온다
        6.최소값부터 값을 차례대로 더했을때 최대값(627) 이상으로 값이 커지는 인덱스를 구하기 위해
        7.for문을 쓰고 for문 안에 최소값부터 최대값을 차례대로 더하는(저장) 변수 sum1를 써주고
        8.sum1변수 안에 array[i]의 인덱스 값들을 대입(저장) 해준다 sum1 = sum1 + array[i];
        9.sum1 = sum1 + array[i]; 은 for문 안의 조건이 맞을 때 마다
        10.첫 번째 반복에서는 i가 0일 때 array[0]의 값을 sum1 변수에 더하게 되고 이 반복은 조건이 맞지않을 때 까지 계속 반복한다
        11.그후 조건문 if를 쓰고 조건은 sum1 > array[11] 이조건은 sum1이 array[11]의 인덱스 11번째 값보다 크면 실행하라 라는 뜻
        12.int number = 0; 은 값을 차례대로 더했을때 최대값 이상으로 값이 커지는 인덱스를 출력하기 위한 변수를 선언
        13.number = i; 를 if문 안에 씀으로 인해 최대값 이상으로 커진 i번째 인덱스를 number 에 저장
        14.break; 를 써주지 않으면 array의 배열길이 끝까지 순환함 결국 값이 11번째 인덱스가 나오게됨
         */

        int[] array = new int[]{54,87,14,25,97,5,41,4,627,85,41,365};
























//
//        int[] array = new int[]{54,87,14,25,97,5,41,4,627,85,41,365};
//        Arrays.sort(array);
//        int sum1 = 0;
//        int sum2 = 0;
//        sum2 = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]
//                + array[10] + array[11];
//        int number= 0;
//
//
//        for (int i = 0; i < array.length; i++) {
//            sum1 = sum1 + array[i];
//            if (sum1 > array[11]) {
//                number = i;
//                break;   // 처음 break를 걸지 않았을때 값이 다르게 나옴 array 배열 11번째 까지 나오게됨
//                         // break를 써주지 않으면 array의 배열길이 끝까지 순환함 결국 값이 11번째 인덱스가 나오게됨
//            }
//        }
//
//        System.out.println("배열 안의 최소값: " +array[0]);
//        System.out.println("배열 안의 최대값: " + array[11]);
//        System.out.println("배열 안의 수 들을 모두 더한값: " + sum2);
//        System.out.println("최대값 이상으로 값이 커지는 인덱스: " + number);
    }
}