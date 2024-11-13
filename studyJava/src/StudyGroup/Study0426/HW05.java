package StudyGroup.Study0426;

import java.util.Scanner;

//각 배열의 크기는 100으로 하며,
// a배열에는 1부터 100까지,
// b배열에는 101부터 200까지,
// c배열에는 201부터 300까지의 숫자를 저장한다.
// 유저에게 값을 입력 받은 뒤 그 배열의 값이 어느배열에 몇번째 인덱스번호에 저장되어있는지를 출력하시오.
public class HW05 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = new int[100];
        int[] c = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력하세요: ");
        int num = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            b[i] = i + 101;
            c[i] = i + 201;
        }

            if (num > 0 && num <= 100) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == num) {
                        System.out.println("a 배열의 " + i);
                    }
                }
            } else if (num > 100 && num <= 200) {
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == num) {
                        System.out.println("b 배열의" + i);
                    }
                }
            } else if (num > 200 && num <= 300) {
                for (int i = 0; i < c.length; i++) {
                    if (c[i] == num) {
                        System.out.println("c 배열의" + i);
                    }
                }
            }
        }
    }