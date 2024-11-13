package ExampleArray;

public class H1 {
    public static void main(String[] args) {
        // 배열의 선언 방법 1
        int[] array1 = new int[3];
        int[] array2;
        array2 = new int[3];

        // 배열의 선언 방법 2
        int array3[] = new int[3];
        int array4[];
        array4 = new int[3];

        //다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
        boolean[] array5 = new boolean[3];
        int[] array6 = new int[5];
        double[] array7 = new double[7];
        String[] array8 = new String[9];

        // 배열 객체에 값 대입하기

        int[] a = new int[3];

        a[0] = 3;
        a[1] = 4;
        a[2] = 5;

        // 배열 객체 값 읽어오기

       // System.out.println(a[0]);

        // 배열 객체를 생성하고 값 대입하기
        int[] b = new int[3];
        b[0] = 3;
        b[1] = 4;
        b[2] = 5;

        // 배열 객체 생성과 함께 값 대입하기
        int[] c = new int[]{3,4,5};  // [] 배열의 길이를 지정하지않음 배열의 길이는 값의 개수로 결정

        // 대입할 값만 입력하기
        int[] d = {3,4,5};


    }
}
