package StudyGroup.Study0424;

import java.util.Arrays;

//1부터 100까지의 숫자를 저장하고 있는 배열이 있다.
//그 중 5의 배수만 10개만 골라 새로운 배열에 담는다.
//그 배열을 출력하시오.
public class HW03 {
    public static void main(String[] args) {
        int[] num = new int[100];
        int[] num1 = new int[10];


        for (int i=0; i<num.length; i++) {
            num[i] = i+1;
        }


        for (int i=0, j=0; i<num.length; i++) {
            if (num[i] % 5==0) {
                num1[j] = num[i];
                j++;
                if (j > 9) {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(num1));

    }
}
