package JavaExample0313;

import java.util.Arrays;

public class Java0313 {
    public static void main(String[] args) {
        // 아래 배열중에 짝수만 출력
        int[] arr = new int[]{1, 2, 3, 4, 5};  // arr 배열 값

        for( int i = 0; i<arr.length; i++) { // 배열의 길이를 구함

            if( arr[i] % 2 == 0) { //

                System.out.println(arr[i]); // aar{i} 짝수만 출력
            }
        }
     /*   int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = new int[intArray1.length];
        for (int i=0; i< intArray1.length; i++) {
            intArray2[i] = intArray1[i];
        }
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));

        // 위 코드 작성한 후, git에 올려져있는 Java0312Array2.java 코드 분석!!  */
    }
}
