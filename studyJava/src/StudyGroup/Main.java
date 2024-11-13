package StudyGroup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("값을 입력하시오.");
        int num = scanner.nextInt();
        num = num+1;
        System.out.println(num);
    }
}