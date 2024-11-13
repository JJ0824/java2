package For_While;

public class Java20240305 {
    public static void main(String[] args) {
        // break = 중괄호를 탈출시키는 키워드
        // i++ = 증감식 1씩증가
        // for = ~하는중에
        // if = 만약에
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i  >5) {   // 만약 i가 5보다 크면, break문을 통해 반복문을 종료
                break;
            }
        }


        //바깥 for문까지 탈출하는 다른 방법

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    break;
                }
                System.out.print(i + "," + j);
            }
        }
        // continue 사용법
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) { // 홀수의 경우 아래 출력문을 실행하지 않음
                continue;
            }
            System.out.println(i);
        }
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.println(i + "," + j);
            }

        }
    }
}
