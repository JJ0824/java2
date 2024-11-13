package Array;

import java.util.Arrays;

public class Java20240305Array2 {
    public static void main(String[] args) {
        // 기본자료형의 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b);
        b = 5;
        System.out.println(a + " " + b);

        // 참조자료형의 복사 ==> 참조복사 또는 주소복사
        int[] intList1 = {3, 4, 5};
        int[] intList2 = intList1;
        //System.out.println(Arrays.toString(intList2));




    }
}
