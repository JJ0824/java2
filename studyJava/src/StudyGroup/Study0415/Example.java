package StudyGroup.Study0415;
//1번부터 5번까지 if문 활용
//6번부터 10번까지 for문 활용
//11번부터 15번까지 while문 활용
//16번부터 20번까지 do-while문 활용
//21번부터 22번까지는 switch문 활용
public class Example {
    public static void main(String[] args) {

        //1. a가 100일때 true 출력하는 코드를 작성하시오. (a = 100)
        int a = 100;
        if (a == 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println();

//2. age가 0보다 작을때 : false,
// 0부터 7까지 중 하나일 때는 유치원,
// 8부터 13중 하나일 때는 초등학생,
//14부터 16까지 중 하나일때는 중학생,
// 17부터 19까지중 하나일 때는 고등학생, 나머지일때는 성인을 출력하는코드를 작성하시오.

        int age = 1;

        if (age > 0) {
            System.out.println(false);
        } else if (age >= 0 && age <= 7) {
            System.out.println("유치원");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
        System.out.println();

////3. boolean이 true면 참, false일때 거짓을 출력하는 코드를 작성하시오.


        if (true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println();


////num1은 10, num2는 20, num3은 100, num4는 50일때,
////4. 합이 50이상이면 true, 이외는 fales를 출력하는 코드를 작성하시오.
        int num1 = 10;
        int num2 = 20;
        int num3 = 100;
        int num4 = 50;
        int sum = 0;
        sum = sum + num1 + num2 + num3 + num4;

        if (sum > 50) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println();
////5. num1과 num2의 곱이 num3과 num4의 합의 크기보다 큰것이 맞다면 true, 틀리다면 false를 출력하는 코드를 작성하시오.
        int mult = 0;
        mult = num1 * num2;
        int sum1 = 0;
        sum1 = num3 + num4;

        if (mult > sum1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println();

////6번부터 10번까지 for문 활용

////6. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
        for (int i = 14; i <= 34; i++) {
            System.out.println(i);
        }
        System.out.println();
////7. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
        for (int i = 0; i <= 5; i++) {
            System.out.println(i * 3);
        }
        System.out.println();
//8. 100부터 90까지의 숫자를 출력하시오
        for (int i = 100; i >= 90; i--) {
            System.out.println(i);
        }
        System.out.println();
//9. 6번 반복해서 55,66,77,88,99,100을 출력하는 코드를 작성하시오.  //////////////////////////////////////////
        for (int i = 5; i < 10; i++) {
            System.out.println(i * 11);
        }
        System.out.println();
//10. (o,p)o은 0부터 10까지,p은 100부터 90까지 출력하는 코드를 작성하시오.
        for (int o = 0; o <= 10; o++) {
            for (int p = 100; p >= 90; p--) {
                System.out.println(p);
            }
            System.out.println(o);
        }
        System.out.println();

//11번부터 15번까지 while문 활용
//11. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
        int i = 14;
        while (i < 34) {
            System.out.println(i);
            i++;
        }
        System.out.println();
//12. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
        int j = 0;
        while (j <=5) {
            System.out.println(j * 3);
            j++;
        }
        System.out.println();
//13. 100부터 90까지의 숫자를 출력하시오
        int k = 100;
        while (k >= 90) {
            System.out.println(k);
            k--;
        }
        System.out.println();
//14. 5번 반복해서 55,66,77,88,99,100을 출력하는 코드를 작성하시오.
        int f = 5;
        while (f < 10) {
            System.out.println(f * 11);
            f++;
        }
        System.out.println();

//15. (q,w)q은 0부터 10까지,w은 100부터 90까지 출력하는 코드를 작성하시오.
        int q = 0;
        int w = 100;
        while (q <= 10) {
            System.out.println(q);
            q++;
        }
        System.out.println();
        while (w >= 90) {
            System.out.println(w);
            w--;
        }
        System.out.println();

//16번부터 20번까지 do-while문 활용
//16. 철수는 13까지 숫자를 세었고 34까지의 숫자를 세어야 한다면 철수가 세어야 할 남은 숫자들을 출력하는 코드를 작성하시오.
        int s = 14;
        do {
            System.out.println(s);
            s++;
        }
        while (s <= 34);

        System.out.println();
        //17. 0부터 5까지 숫자에 +3을 한 모든 수를 출력하시오
        int d = 0;
        do {
            System.out.println(d*3);
            d++;
        }
        while (d <= 5);
        System.out.println();
//18. 100부터 90까지의 숫자를 출력하시오
        int g=100;
        do {
            System.out.println(g);
            g--;
        }
        while (g>=90);
        System.out.println();
//19. 5번 반복해서 55,66,77,88,99,100을 출력하는 코드를 작성하시오.
        int c=5;
        do {
            System.out.println(c * 11);
            c++;
        }
        while (c < 10);
        System.out.println();
//20. (z,x)z은 0부터 10까지,x은 100부터 90까지 출력하는 코드를 작성하시오.
        int z = 0;
        int x = 100;


//21번부터 22번까지는 switch문 활용
//21. b가 10이고 v가 5일때 두 변수를 곱한 값이 50이면 '값은 50입니다.', 60이면 '값은 60입니다.'를 출력하는 코드를 작성하시오.
        int b=10;
        int v=6;
        int mul2 = 0;
        mul2 = b * v;
        int choose = 0;

        if (mul2 == 50){
            choose = 1;
        } else if (mul2==60) {
            choose = 2;
        }
        switch (choose) {
                case 1:
                    System.out.println("값은 50입니다");
                    break;
                case 2:
                    System.out.println("값은 60입니다");
                    break;
            }




/*       int b = 10;
        int v = 5;
        int mul2 = b * v;

        switch (mul2) {
            case 60:
                System.out.println("값은 60입니다");
                break;
            case 50:
                System.out.println("값은 50입니다");
                break;
        }   */

//22. numf는 100, nums는 50일때 두 수를 더한 값이 150이 맞다면 true, 틀리다면 false를 출력하는 코드를 작성하시오.
        int numf = 100;
        int nums = 50;
        int sum2 = 0;






    }
}



