package StudyGroup.Study0405;
//SKY반에는 학생 A,B,C,D,E,F,G가 있고 각 학생의 점수는 80,45,29,78,64,98,57 이다.
//SKY반 학생들의 성적을 하나의 배열로 보관하고,
//SKY반 학생의 평균,최고점,최저점을 구하시오.

// 1. 학생들의 점수를 하나의 배열안에 넣는다
// 2. 평균,최고점,최저점을 구하시오.
public class H03 {
    public static void main(String[] args) {
        int[] array = new int[]{80,45,29,78,64,98,57};

        float sum=0f;
        int numMax = array[0];
        int numMin = array[0];

        for (int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("학생의 평균 점수 : " + sum / array.length);

        for (int i=0; i<array.length; i++) {
            if (array[i] > numMax) {
                numMax = array[i];
                System.out.println("학생의 최고 점수 : " + numMax);
            }
        }
        for (int i=0; i<array.length; i++) {
            if (array[i] < numMin) {
                numMin = array[i];

            }
        }System.out.println("학생들의 죄저 점수 : " + numMin);
    }
}
