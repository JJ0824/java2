package StudyGroup.Study0524;

import java.util.Arrays;
import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        // 문제 3. Students 클래스에 한명의 학생의 성적을 입력받는 메서드를 입력받아 저장하는 메서드를 구현하시오.
        // 성적은 국어, 수학, 사회, 과학으로 구성
        // 메서드를 호출해 학생 3명의 성적을 입력받으시오.
        // 문제 4. 저장된 학생의 성적을 입력매게변수로 받아 그 학생의 평균 점수를 반환하는 메서드를 구현 후 실행하시오.
        // 문제 5. 반평균을 구하는 메서드를 구현 후 실행하시오.

        int[] score = new int[4];
        String[] subject = new String[]{"국어","수학","사회","과학"};
        double sum = 0;
        double average = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("성적을 입력하세요.");

        for (int i=0; i<score.length; i++) {
            System.out.println(subject[i]);
            score[i] = scanner.nextInt();

            sum = sum + score[i];

        }
        System.out.println("학생들의 성적 총합: " + sum);
    }
}