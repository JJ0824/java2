package StudyGroup.Study0419;
//A배열과 B배열을 만들고
//A배열에는 {1,2,3,4,5,6,7,8,9,10}을 저장하고
//B배열에는 유저에게 1부터 20까지의 숫자 중 5개의 숫자를 입력받은 뒤
//A배열에 유저에게 입력받은 값과 같은 수가 몇개 있는지 세고,
// 그 숫자들을 출력해서 보여주는 코드를 작성하시오.

/*  B배열에는 유저에게 1부터 20까지의 숫자 중 5개의 숫자를 입력 = 스캐너를 이용해 유저로부터 입력받는다

A배열에 유저에게 입력받은 값과 같은 수가 몇개 있는지 세고
=count를 써서 값과 같은 수가 몇개 있는지 세고 if문을 이용해 같은수 일때 를 조건을 건다
 */


import java.util.Arrays;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    // A배열에는 {1,2,3,4,5,6,7,8,9,10}을 저장
        int[] b = new int[5];
        int count = 0;

        System.out.println("1부터 20까지의 숫자중 5개를 입력하세요: ");  // 사용자에게 출력되는 코드
        Scanner sc = new Scanner(System.in);   // 유저에게 입력받는 코드


        for (int i = 0; i < b.length; i++) {
            int num = sc.nextInt();
            b[i] = num;
            if (num == b[i]) {
                count++;
            }
            System.out.println(Arrays.toString(b));

        }System.out.println("같은 값의 반복 되는 수 : " + count);
    }
}
