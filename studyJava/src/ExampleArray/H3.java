package ExampleArray;

public class H3 {
    public static void main(String[] args) {

        // 스택 메모리값(강제 초기화되지 않음)
        int value1;
        // System.out.println(value1); // 오류
        int[] value2;                         // 스택 메모리에 위치하는 변수는 초기화 없이 출력 불가능
        // System.out.println(value2); // 오류
        int value3 = 0;
        System.out.println(value3);  // 0으로 초기화
        int[] value4 = null;
        System.out.println(value4);
        System.out.println();

        // 힙 메모리의 초기값(강제 초기화)
        // 기본 자료형 배열
        boolean[] array1 = new boolean[3]; // false로 초기화

    }
}
