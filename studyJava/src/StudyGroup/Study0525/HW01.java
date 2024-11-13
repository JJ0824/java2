package StudyGroup.Study0525;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        int asum = 0;
        int bsum = 0;

        int amax = Integer.MIN_VALUE;
        int amin = Integer.MAX_VALUE;

        int bmax = Integer.MIN_VALUE;
        int bmin = Integer.MAX_VALUE;

        // 내일 외부 클래스로 해보기! ㅎㅎ 

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<a.length; i++) {
            a[i] = scanner.nextInt();
            asum += a[i];
            if (a[i] > amax) {
                amax = a[i];
            }if (a[i] < amin) {
                amin = a[i];
            }
        }

        System.out.println("a 배열의 총합: " + asum);
        System.out.println("a 배열의 최대값: " + amax);
        System.out.println("a 배열의 최소값: " + amin);

        for (int i=0; i<b.length; i++) {
            b[i] = scanner.nextInt();
            bsum += b[i];
            if (b[i] > bmax) {
                bmax = b[i];
            }if (b[i] < bmin)
                bmin = b[i];
        }
        System.out.println("b 배열의 총합: " + bsum);
        System.out.println("b 배열의 최대값: " + bmax);
        System.out.println("b 배열의 최소값: " + bmin);

        if (asum > bsum) {  // 두 배열의 총 합을 비교
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (amax > bmax) {  // 두 배열의 최대값을 비교
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}