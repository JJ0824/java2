package StudyGroup.Study0513;

import java.util.Arrays;

public class HW01 {
    public static void main(String[] args) {
        //아래 배열은 학생 각각의 점수들을 담고 있는 배열이다. -> 순서는 국어, 수학, 영어, 사회, 과학
        int [] tomGrade = new int[] {40,57,84,75,96};
        int [] saraGrade = new int[] {75,84,98,63,75};
        int [] davidGrade = new int[] {88,45,75,62,51};

        //문제1.변수 name 을 이용해 각 학생들의 총점과 평균을 구하는 코드를 작성하시오.
        //name 에는 각각의 학생들이 들어올 수 있다.
        int [] name = new int[5];
        name = tomGrade;
        double sum = 0;
        double avg = 0;
        for (int i=0; i< name.length; i++) {
            sum += name[i];
            avg = sum / 5;
        }
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);

    }
}