package StudyGroup.Study0404;


import StudyGroup.Study0402.Array;

import java.util.Arrays;

// 1~100 까지의 숫자중 5의 배수인 숫자는 Array5에 저장하고
// 10인 배수인 숫자는 Array10에 저장한다
// 1.Array5 의 인텍스의 총 합 = sum5  // 출력
// 2.Array5와 Array10에 공배수를 Array0이란 배열에 저장. // 출력
public class H01 {
    public static void main(String[] args) {
        int[] array5 = new int[20];
        int[] array10 = new int[10];
        int[] array0 = new int[10];
        int sum = 0;
        int k=0;

        //5의배수 구한뒤 Array5에 입력하기
        for (int i = 1,j = 0; i <= 100; i++) {
            if(i % 5 ==0){
                array5[j] = i;
                j++;
            }
        }
        //10의배수 구한뒤 Array5에 입력하기
        System.out.println(Arrays.toString(array5));
        for(int i = 1,j = 0;i <= 100;i++){
            if(i % 10 == 0){
                array10[j]=i;
                j++;
            }
        }
        //Array5의 총 합 구하기
        System.out.println(Arrays.toString(array10));
        for(int i=0;i<array5.length;i++){
            sum =sum+array5[i];
        }
        System.out.println("Array5의 총 합 : "+sum);

        //Array5와 Array10에 있는 같은 수를 Array0에 저장해라.
        for(int i = 0; i < array5.length; i++) {
            for(int j =0;j<array10.length;j++){
                if(array5[i]==array10[j]){
                    array0[k]=array5[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(array0));
    }
}
