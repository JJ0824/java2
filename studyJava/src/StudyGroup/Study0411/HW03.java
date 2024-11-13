package StudyGroup.Study0411;
/*
1) 1부터 100까지의 숫자 중 2의 배수이며 5의 배수인 숫자를 한줄로 출력하고(','또는 띄어쓰기로 숫가끼리의 구분 필요),
   그 숫자들의 총 갯수와 for문의 총 반복 횟수를 출력하는 코드를 작성하시오.

   2의 배수이며 5의 배수인 숫자의 갯수
   2로 나눴을때 나머지가 0인것 중에 5로 나눠서 나머지가 0이면 2와 5의 공배수
   count 몇개인지 알고 싶은거면 i가 공배수가 맞을때만 count가 1씩 증가
 */
public class HW03 {
    public static void main(String[] args) {
        int count = 1;
        for (int i=1; i<=100; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.print( count++ + "번:");
                System.out.print(i + " ");
            }
        }
    }
}
