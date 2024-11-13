package StudyGroup.Study0406;


import java.util.Scanner;

// 2.array배열에 1부터 50까지의 숫자를 저장하고 사용자에게 임의이 값을 입력받은뒤
// 그 수가 array 배열에 있으면 “있다” 없으면 “없다”를 출력하시오
public class HW02 {
    public static void main(String[] args) {


        int[] array = new int[50];

        Scanner scanner = new Scanner(System.in);
        System.out.println("임의의 값을 입력하세요 :  ");
        int num = scanner.nextInt();
        System.out.println("사용자에게 입력 받은 숫자 : ");

        for (int i=0; i<array.length; i++) {
           array[i] = scanner.nextInt();
            System.out.println(i+1);
        }




    }
}
