package StudyGroup.Study0424;

import java.util.Arrays;

// array 라는 배열에는 숫자가 1부터 20까지 있다.
// 배열에 저장되어 있는 값 중 10보다 작은숫자는 array1 배열에, 10부터 나머지까지의 숫자는 array2 배열에 저장하는
// 코드를 작성하시오.
// 힌트:) array1의 크기는 9, array2 배열의 크기는 각각 11으로 한다.
public class HW01 {
    public static void main(String[] args) {
       int[] array = new int[20];
       int[] array1 = new int[9];
       int[] array2 = new int[11];

       for (int i=0; i<20; i++) {
           array[i] = i+1; // 인덱스의 빈방은0~20까지의 빈방안에 i번째 인덱스 주소값에 1을 대입해 0번지 주소값에 1부터 나오게 증가시킨다
       }

//       for (int i = 0, k = 0;i<array.length;i++){
//           if(array[i] <= 9){
//               array1[i] = array[i];
//           } else {
//               array2[k] = array[i];
//               k++;
//           }









       for (int i=0,j=0; i<array.length; i++ ) {
           if (array[i] <= 9) {
               array1[i] = array[i];
           } else  {
               array2[j] = array[i];
               j++;
           }
       }System.out.println(Arrays.toString(array2));
       System.out.print(Arrays.toString(array1));
    }
}









