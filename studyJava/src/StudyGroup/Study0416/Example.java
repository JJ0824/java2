package StudyGroup.Study0416;
//1. 무한루프 for문 생성
//2.  0부터 모든수를 나타내는 무한루프 생성
//3. 제어키워드를 사용해 무한루프 탈출
//4. 조건을 걸어 10까지 출력후 탈출 하는 무한루프 생성


public class Example {
    public static void main(String[] args) {

       /* for (int i=0; ; i++){
            if (i>10) {
                break;
            }
            System.out.println(i);
        } */
//0~10까지의 숫자 중
// 1. 2의 배수
// 2. 3의 배수
// 3. 1번과 2번의 숫자들의 총합
// 4. 그 숫자들의 총 합이 짝수인지 홀수 인지 나타내라.
        int sum=0;

        for (int i=0; i<=10; i++) {
            if (i % 2==0) {
                System.out.println("2의 배수: " + i);

                sum = sum+i;
            }
        }
        for (int j=0; j<10; j++){
            if (j % 3==0) {
                System.out.println("3의 배수: " + j);
                sum = sum+j;
            }
        }
        System.out.println("그 숫자들의 합: " + sum);
        if (sum % 2==0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }
    }
}






















