package StudyGroup.Study0403;


//(본인 이름) 학생의 국어점수는 100점, 수학점수는 40점, 영어점수는 60점이다.
//(본인 이름) 학생의 총점은 (연산하시오.)이다.
//(본인 이름) 학생의 평균은 (연산하시오.)이다.

public class HW01 {

    public static void main(String[] args) {

        int sum = 0;            // sum 값을 저장

        int language = 100;      // 국어점수는 100점
        int mathematics = 40;    // 수학점수는 40점
        int english = 60;        // 영어점수는 60점

        sum = language + mathematics + english;   // 국어,수학,영어 합한 값을 sum에 대입

        float average = sum / 3;   // 정수형 변수를 만들고 국어,수학,영어 합한 sum과 3을 나눠 평균값을 구합
                                 // 평균구하는 공식은 [총점/갯수] (총점과 과목3개)

        System.out.println("홍성규 학생의 국어점수는: " + language + " " + "수학점수는: " + mathematics + " " + "영어점수는: " + english + "점이다");
        System.out.println("홍성규 학생의 총점은 : " + sum + "이다");
        System.out.println("홍성규 학생의 평균은 : " + average + "이다");



    }

}
