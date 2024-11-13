package StudyGroup.Study0430;

/* 참고자료 0430(3) 파일 참고해서 코드 작성

1. 모든 문장을 하나의 변수에 저장 후 출력하시오.
2.str1의 길이를 구하시오.
3.str2에서 처음나오는 숫자의 인덱스 번호를 구하시오.(단 앞에서부터 count하는 것을 를 기본으로 함)
4. 1번의 변수에 a가 몇개 들어있는지를 구하시오.

 */
public class HW03 {
    public static void main(String[] args) {

        String str1 = "Hello, My name is Alex, nice to meet you.";
        String str2 = "I am 26. but I'm still student.";


        // 1. 모든 문장을 하나의 변수에 저장 후 출력하시오.
        System.out.println(str1.concat(str2));

        //2.str1의 길이를 구하시오.
        System.out.println(str1.length());

        //3.str2에서 처음나오는 숫자의 인덱스 번호를 구하시오.(단 앞에서부터 count하는 것을 기본으로 함)
        int index = str2.indexOf("2");
        System.out.println("처음나오는 숫자의 인덱스 번호: " + index);

        // 4. 1번의 변수에 a가 몇개 들어있는지를 구하시오.
        char targetA = 'a';
        int count2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == targetA) {
                count2++;
            }
        }
        System.out.println("a의 중복 횟수: " + count2);


    }
}
