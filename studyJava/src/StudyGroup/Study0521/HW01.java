package StudyGroup.Study0521;

import Java0326.A;
import StudyGroup.Study0402.Array;

import java.util.Arrays;

import java.util.Scanner;

public class HW01 {

   /*
    DW 고등학교 1학년 신입생 이름 저장 프로그램
    조건 : 외부클래스 사용 / 입력매게변수 사용
    각 A,B,C반이 있으며 각 반의 학생은 5명으로 규정한다.

    1. 각 반의 학생 수는 5명이므로 5개의 크기가 저장되는 배열을 생성한다.
    2. 5명의 학생 이름을 저장 하기위해 for문을 통해 5번 반복하며 for문안에 변수를 만들어 변수의[i]번째 주소에 5명의 학생 이름을 저장한다.
    3.
    */

    public static void main(String[] args) {

        String[] a = new String[5];

        Name name = new Name();
        name.strings(a);


    }
}