package Java_Example0326;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.김수중 2.윤별 3.홍성규 4.송진경 5.육승환
        //학생의 학번을 입력해 주세요
        //학생의 학번에 맞는 이름을 출력하세요

        System.out.println("학생의 학번을 입력해 주세요");

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();



        if(num==1){
            System.out.println("김수중");
        }
        else if(num==2){
            System.out.println("윤별");
        }
        else if(num==3){
            System.out.println("홍성규");
        }
        else if(num==4){
            System.out.println("송진경");
        }
        else if(num==5){
            System.out.println("육승환");
        }
        else {
            System.out.println("flase");
        }

    }
}
