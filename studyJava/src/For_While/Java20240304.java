package For_While;

public class Java20240304 {

    public static void main(String [] args) {


        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }
        // 무한루프
        // 조건식이 false가 될 수 있는지 여부를 반드시 확인!
        //for(int i = 0; i >= 0; i--) {
        //    System.out.println(i);

        // }

        // for 문 기본 문법 구조
        int a;
        for (a = 0; a < 3; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + "");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) { // 반복이 한 번 실행될 때마다 i와 j를 1씩 증가
            System.out.print(i + j + ""); // i와 j를 더한 값을 출력 + ""는 숫자를 문자열로 변환하기 위한 것
        }
        System.out.println();  // 각각의 값은 i와 j가 동일한 증가율을 가지므로, 0부터 9까지의 숫자가 각각 더해져 출력

        //for 문의 특수한 형태(무한 루프)

        /*for(int i = 0; ; i++) {
        System.out.print(i + " ");
        }
        for(ii) {
        System.out.print("무한 루프");
        }

         */


        System.out.println();

        // 무한루프 탈출
        for (int i = 0; ; i++) {
            if (i < 10) {
                break;
            }
            System.out.print(i + "");
        }
        System.out.println("무한 루프 탈출");

        // for문 변형하기
        int i = 0;
        for (; ; ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            } else {
                break;

            }
        }


        System.out.println();


            // 멀티 조건식
        for(
            int e= 0, f= 0; e<5 || f<5; e++,f++)

            {
                System.out.print(e + "_" + f + " ");
            }

        System.out.println();
        //while 문
        int count = 0; //초기식
        while (count < 5) {
            System.out.print(count + " ");
            count++; // 증감식
            System.out.println(

            );

            //의도적인 무한루프에서 while문은 자주 쓰임
//            while (true) {
//                // 무한루프
//                // 유저가 버튼 클릭할때까지 대기
//                // if (esc버튼 클릭)
//                //      break;
//            }
        }
        // do ~ while 문
        int cnt1 = 0; // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        } while (cnt1 < 5);
        // ㅏ래 while 문과 비교하면,
        // 반목문의 조건이 처음부터 false인 경우,
        // do~while문은 실행코드가 1회 싱행되는 반면, while문은 실행되지 않음
        int cnt2 = 5;
        while (cnt2 < 5) {
            System.out.print(cnt2 + " ");
            cnt2++;
        }

        // 이중루프, 이중반복문
        for (int g=0; g<5; g++) {
            for (int j=0; j<6; j++) {
                System.out.println("[g=" + g + ", j=" + j + "j");
            }
        }
    }
}
