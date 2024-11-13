package StudyGroup.Study0411;

public class dsa {
    public static void main(String[] args) {
        int i, count = 0;
        for (i=1; i <= 100; i++) {
            if (i % 2 == 0){
                if(i % 5 == 0){
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
        System.out.println(); // 띄어쓰기
        System.out.println("출력된 숫자들의 갯수 : " + count );
        System.out.println("for문의 반복 횟수 : "+ i );
    }
}
