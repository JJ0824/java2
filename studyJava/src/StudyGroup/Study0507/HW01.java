package StudyGroup.Study0507;

import java.util.Scanner;

//김수중,홍성규,송진경 순으로 3명의 학생 의 성적을 입력받아 배열에 저장한다.
//배열이 하나 있고 그 배열에 0번지에는 김수중의 성적 하나 1번지는 나 2번지는 진경이
//그 학생들의 평균성적을 구한 뒤 구한 평균 성적을 바탕으로 학생들의 성적을 분류하여 출력한다.
// 결과값 예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하)
//*이하는 기준점을 포함한 그보다 아랫수자를 의미함*
public class HW01 {
    /*
        1.김수중,홍성규,송진경 순으로 3명의 성적을 입력을 받을 하나의 배열을 생성한다
        2.3명의 성적을 입력을 받을 스캐너를 메서드를 쓴다.
        2.배열에 0번지에는 김수중의 성적 하나 1번지는 나 2번지는 진경이를 저장한다.
        3.학생들의 평균값을 구하기 위해 학생들의 성적을 먼저 구한뒤 3명의 학생의 성적을 모두 더한다
        4.모두 더한 값이 나오면 평균값을 구한다 (모두 더한 값 / 학생들의 수)
        5.평균을 구한 값을 바탕으로 학생들의 성적을 분류한다(예시 => 학생명 : st1, 점수 : 100점, 평균 이상(혹은 이하))
        6.
     */
    public static void main(String[] args) {
        int[] Students = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("김수중 학생의 성적: ");
        Students[0] = sc.nextInt();

        System.out.println("홍성규 학생의 성적: ");
        Students[1] = sc.nextInt();

        System.out.println("송진경 학생의 성적: ");
        Students[2] = sc.nextInt();

        float sum = 0;
        float average = 0;

        for (int i = 0; i < Students.length; i++) {
            sum += Students[i];
            average = sum / 3;
        }
        if (Students[0] > average) {
            System.out.println("학생명 : 김수중 점수 :" + Students[0] + "평균 이상입니다");
        }else {
            System.out.println("학생명 : 김수중 점수 :" + Students[0] + "평균 이하입니다");
        }
        if (Students[1] > average) {
            System.out.println("학생명 : 홍성규 점수 :" + Students[1] + "평균 이상입니다");
        }else {
            System.out.println("학생명 : 홍성규 점수 :" + Students[1] + "평균 이하입니다");
        }
        if (Students[2] > average) {
            System.out.println("학생명 : 송진경 점수 :" + Students[2] + "평균 이상입니다");
        }else {
            System.out.println("학생명 : 송진경 점수 :" + Students[2] + "평균 이하입니다");
        }
        System.out.println("학생들의 합계: " + sum);
        System.out.println("학생들의 평균 성적: " + average);
    }
}
