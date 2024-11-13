package StudyGroup.Study0426;
// 다음 출력이 되는 코드를 작성 하시오.
/*
초등학생
1학년 = 8살
2학년 = 9살
3학년 = 10살
4학년 = 11살
5학년 = 12살
6학년 = 13살
중학생
1학년 = 14살
2학년 = 15살
3학년 = 16살
고등학생
1학년 = 17살
2학년 = 18살
3학년 = 19살
 */

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("초,중,고 학교 중 하나를 입력하세요: ");
        String st = sc.nextLine();

        switch (st) {
            case ("초등학생"):
                System.out.println("1학년 = 8살");
                System.out.println("2학년 = 9살");
                System.out.println("3학년 = 10살");
                System.out.println("4학년 = 11살");
                System.out.println("5학년 = 12살");
                System.out.println("6학년 = 13살");
                break;

            case ("중학생"):
                System.out.println("1학년 = 14살");
                System.out.println("2학년 = 15살");
                System.out.println("3학년 = 16살");
                break;

            case ("고등학생"):
                System.out.println("1학년 = 17살");
                System.out.println("2학년 = 18살");
                System.out.println("3학년 = 19살");
                break;
        }
    }
}