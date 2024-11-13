package C0202;

import java.lang.reflect.Array;

public class For02 {
    public static void main(String[]args) {
//        int[] Array = {1, 3, 5, 7, 4, 5};
//
//        int sum=0;
//
//        //Array배열의 인덱스의 총 합을 구하시오
//        for (int i = 0; i< Array.length; i++) {
//
//
//
//            sum = sum + Array[i];
//        }
//        System.out.println(sum);


//        //int i = 15, int j = 10일때 i와 j가 같으면 "옳다", 틀리면 "틀리다"로 출력되는 코드를 만드시오.
//        int i = 15;
//        int j = 10;
//        if (i==j){
//           System.out.println("true");
//        }
//        else {
//            System.out.println("flase");
//        }


        //1부터 5까지 숫자를 더하고(배열 사용) (FOR문 사용)
        //그 결과 값이 15와 같다면 true 다르다면 flase를 출력하는 코드를 만드시오 (if문 사용)

        int[] arr = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i<arr.length; i++) {

            if(sum==15) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            sum += arr[i];

        }System.out.println(sum);


    }

}
