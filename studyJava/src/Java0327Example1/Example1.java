package Java0327Example1;

public class Example1 {
    public static void main(String[] args) {

        // 문제 1. 아래 2차원 배열의 모든 값의 합과 평균을 구하시오
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0;
        float average = 0;

        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                total = total + arr[i][j];

            }
        }average = (float) total / (float) (arr.length * arr[0].length);



        System.out.println("total="+total);   // 325
        System.out.println("average="+average);   // 16.25



        // 7. 아래 배열의 총합과 평균을 출력
//        int[] numberList = {12, 34, 56, 32, 84, 99, 73, 69};
//        int sum = 0;
//        for (int i=0; i<numberList.length; i++) {
//            sum = sum + numberList[i];
//        }
//        int average = sum / numberList.length;
//        System.out.println(sum + " " + average);
    }
}
