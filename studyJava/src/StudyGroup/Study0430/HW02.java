package StudyGroup.Study0430;

import java.util.Arrays;

/* 참고자료 0430(2) 파일 참고해서 코드 작성

1. 참고자료 0430(2) 모습을 출력하시오.
[조건 : 메서드 사용]
2. str1의 '!'를 '하세요'로, '나는'을 '저는'으로 변경하여 출력하시오.
3. 안녕하세요. 나는 '김개똥' 입니다!만나서 반갑습니다^^ //를 출력하시오.
4.str3의 도메인(naver.com)과 아이디(조건:소문자)를 출력하시오.
5.뒤죽박죽인 str4에서 특수문자를 모두 제외하고 출력하시오.

 */
public class HW02 {
    public static void main(String[] args) {

        String str1 = "안녕! 나는 '김개똥' 입니다.";

        String str2 = "만나서 반갑습니다^^";

        String str3 = "kgDD123@naver.com";

        String str4 = "he!lloxx@ni*ce$xxtoxx!mee@txxyou";



        // 1. 참고자료 0430(2) 모습을 출력하시오.
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // 2. str1의 '!'를 '하세요'로, '나는'을 '저는'으로 변경하여 출력하시오.
        // 안녕하세요 저는 김개똥입니다.



         String a = str1.replace("!","하세요");
         String a1 = a.replace("나는","저는");

        System.out.println(a1);
        System.out.println(a);

        // 3. 안녕하세요. 나는 '김개똥' 입니다. 만나서 반갑습니다^^ //를 출력하시오.

        String str99 = str1 = str2;
        System.out.println(str99);


        // 4.str3의 도메인(naver.com)과 아이디(조건:소문자)를 출력하시오.
        //kgdd123 //naver.com

        String[] b = str3.split("@");
        b[0] = b[0].toLowerCase();
        System.out.println(Arrays.toString(b));
        // 5.뒤죽박죽인 str4에서 특수문자를 모두 제외하고 출력하시오.
       //  String str4 = "he!lloxx@ni*ce$xxtoxx!mee@txxyou";





    }
}
