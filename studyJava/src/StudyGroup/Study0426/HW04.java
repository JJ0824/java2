package StudyGroup.Study0426;

import java.util.Scanner;

// 유저에게 나이를 입력 받고,
// 나이에 맞는 학년을 출력하시오.
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

20살부터는 모두 성인으로 출력
 */
public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 8~20살 까지 입력 하세요: ");
        String string = sc.nextLine();

        switch (string) {
            case ("8살"):
                System.out.println("초등학생: 1학년");
                break;
            case ("9살"):
                System.out.println("초등학생: 2학년");
                break;
            case ("10살"):
                System.out.println("초등학생: 3학년");
                break;
            case ("11살"):
                System.out.println("초등학생: 4학년");
                break;
            case ("12살"):
                System.out.println("초등학생: 5학년");
                break;
            case ("13살"):
                System.out.println("초등학생: 6학년");
                break;
            case ("14살"):
                System.out.println("중학생: 1학년");
                break;
            case ("15살"):
                System.out.println("중학생: 2학년");
                break;
            case ("16살"):
                System.out.println("중학생: 3학년");
                break;
            case ("17살"):
                System.out.println("고등학생: 1학년");
                break;
            case ("18살"):
                System.out.println("고등학생: 2학년");
                break;
            case ("19살"):
                System.out.println("고등학생: 3학년");
                break;
            case  ("20살"):
                System.out.println("성인");
                break;

        }
    }
}
