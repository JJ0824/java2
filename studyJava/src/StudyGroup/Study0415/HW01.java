package StudyGroup.Study0415;

import java.util.Scanner;
/*
사용자가 입력한 값을 찾는 코드를 완성하시오.
 */
public class HW01 {
    public static void main(String[] args) {

        System.out.println("사용자가 입력한 숫자 : ");
        Scanner scanner = new Scanner(System.in);

        int userNum = scanner.nextInt();

        for (int i = 0; i < 10 ; i++) {
            if (userNum==i){
                System.out.println(i);
            }
        }
    }
}
