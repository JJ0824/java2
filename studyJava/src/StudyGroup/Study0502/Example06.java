package StudyGroup.Study0502;


import java.util.Arrays;

public class Example06 {
    public static void main(String[] args) {
        /*
            문제 1. 하나의 배열을 이용하여
            [1,2,3,4,5,6,7,8,9,10]
            [3,6,9,12,15,18,21,24,27,30]
            [5,10,15,20,25,30,35,40,45,50]
            을 출력하시오 . 단 직접 값을 입력하지 말고 제어문 사용
         */




        /*
            문제2.  각 반에 ‘김’씨 성을 가진 학생이 몇명인지를 구하시오.
            A반 학생 [김개똥,이무기,이짱구,김맹구,신형만, 이진철, 김사랑, 신양철]
            B반 학생 [이맹지, 김망중, 이배철, 신하람,신해성,민지성,이인아]
            C반 학생 [홍익사,이안경,안철구,김민주,신이삼,김아경,민진아,이알구]

            contains 포함하다
            대상 문자열에 특정 문자열이 포함되어 있는지를 확인하는 역할을한다
            특정 문자열이 포함되어 있으면 true 없다면 false


         */
        String[] a = new String[]{"김개똥", "이무기", "이짱구", "김맹구", "신형만", "이진철", "김사랑", "신양철"};
        String[] b = new String[]{"이맹지", "김망중", "이배철", "신하람", "신해성", "민지성", "이인아"};
        String[] c = new String[]{"홍익사", "이안경", "안철구", "김민주", "신이삼", "김아경", "민진아", "이알구"};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        // 바로밑의 for문은 a라는 배열에 길이만큼을 반복하는 for문이므로
        // b배열과 a의 배열에 길이가 다를 때 에러가 생길 수 있다
        // 고로 밑에와 같은 코드를 작성 할 때는 배열마다 for문을 새로 작성해 주는게 좋다
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains("김")) {
                count1++;
            }
        }
        System.out.println("a의 김씨 성을 포함한 학생 수: " + count1); // 3

        for (int i = 0; i < b.length; i++) {
            if (b[i].contains("김")) {
                count2++;
            }
        }
        System.out.println("b의 김씨 성을 포함한 학생 수: " + count2);

        for (int i = 0; i < c.length; i++) {
            if (c[i].contains("김")) {
                count3++;
            }
        }
        System.out.println("c의 김씨 성을 포함한 학생 수: " + count3);


// 힌트: for문 돌려서 김을 포함한것
        /*
            문제3. 두 개의 배열을 하나의 배열로 합치시오.
            [1,2,3,4,5,6,7,8,9,10]
            [가,나,다,라,마,바,사,아,자,차]
            결과 : [1,가,2,나,3,다 …9,자,10,차]
         */


    }
}


























