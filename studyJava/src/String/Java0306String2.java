package String;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Java0306String2 {
    public static void main(String[] args) {


//        // 문자열 수정
//        // @toLowerCase()l toUpperCase()
//        String str1 = "Java Study";
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.toUpperCase());
//
//        //@replace()
//        System.out.println(str1.replace("Study", "공부"));
//
//        //@substring()  **
//        //맨 앞은 포함 맨 뒤는 포함하지 않는다
//        System.out.println(str1.substring(0, 6));
//
//        //@split()
//        //연산자를 이용하여 ';'와 '/' 기준으로 분리시킴
//        // split 메소드의 리턴형은 string[] 문자열의 배열이다 **
//        String[] strArray = "abc/def-ghi jkl".split("/;-;");
//        System.out.println(Arrays.toString(strArray));
//
//        //@trim()
//        //문자열의 앞뒤 공백 제거
//        System.out.println("  abc  ".trim());
//
//        System.out.println();
//        // 모든 공백 지우기
//
//
//        // 문자열의 내용 비교
//        String str2 = new String("java");
//        String str3 = new String("java");
//        String str4 = new String("java");
//
//        //@stack 메모리 비교(==): 위치(번지) 비교
//        System.out.println(str2 == str3);
//        System.out.println(str3 == str4);
//        System.out.println(str4 == str2);
//
//        //@equals(), equalsIgnoreCase(): 내용 비교
//        System.out.println(str2.equals(str3));
//        System.out.println(str3.equals(str4));
//        System.out.println(str3.equalsIgnoreCase(str4));

        // 길이가 10인 배열에 1부터 10까지 값을 입력
        int[] intList1 = new int[10];
        for (int i=0; i<10; i++) {
            intList1[0] = i + 1;
        }
        System.out.println(Arrays.toString(intList1));

        // 길이가 10인 배열에 10부터 1까지 값을 입력
        int[] intList2 = new int[10];
        int len = intList2.length;

        for (int i=0; i<intList2.length; i++){
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));


        System.out.println(intList2);

        // 자바에서 입력값을 받는 방법
       /* Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        if (inputNumber >= 0 && inputNumber <=6) {
            System.out.println(inputNumber);
        } else {
            System.out.println("잘못입력하셨습니다.");
        }

        // 자바에서 문자열을 입력 받는 방법
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr = sc.nextLine();
        System.out.println(inputStr);

         */


        // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
        char[] week = {'월','화','수','목','금','토','일'};
        Scanner scan = new Scanner(System.in);
        System.out.println(" 0~6까지 숫자를 입력해주세요 :  ");
        int num = scan.nextInt();
        System.out.println(week[num]);

        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력 (단, 대소문자 구분하지 마시오)

        String[] members = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner scan2 = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String inputStr = scan2.nextLine();
        boolean found = false;
        for (int i=0; i< members.length; i++) {
            if (members[i].equalsIgnoreCase(inputStr)) {
                System.out.println(members[i] + "님 환영합니다");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("회원가입해주세요");
        }

//        for (int i=0; i< members.length; i++) {
//            if (members[i].equalsIgnoreCase(inputStr.toLowerCase())) {
//                System.out.println(members[i] + "님 환영합니다");
//                break;
//            }
//            if (i == members.length - 1) {
//                System.out.println("회원가입해주세요");
//            }
//        }










  }
}







