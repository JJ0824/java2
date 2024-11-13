package C0202;

public class For07 {
    public static void main(String[] args) {
//        int a = 85;
//
//        if(a >= 90) {
//            System.out.println("A학점"); //false
//        }
//        else if(a >= 80) {
//            System.out.println("B학점"); // true 출력됨
//        }
//        else if (a >= 70) {
//            System.out.println("C학점"); // true 실행 x ("B학점") 실행
//        }
//        else {
//            System.out.println("F학점"); // 위에 모두 false 일때 실행  실행 x ("B학점") 실행
//        }

        // 유형 1: if

        int value1 = 5;
        if(value1 > 3 ) {
            System.out.println("실행1"); //true 실행a
        }
        if(value1 < 5) {
            System.out.println("실행2"); // false
        }

        boolean bool1 = true;
        boolean bool2 = false;

        if (bool1) {
            System.out.println("실행3"); // true 실행
        }
        if(bool2) {
            System.out.println("실행"); // flase
        }
        // 유형 2: if-else

        int value2 = 5;
        if(value2 > 3) {
            System.out.println("실행5"); // true  실행
        }
        else {
            System.out.println("실행6"); //  false
        }

        // 유형 3: if-else if-else if-...else

        int value3 = 85;
        if(value3 > 90) {
            System.out.println("A학점"); // false  출력x
        }
        else if(value3 >=80 ) {
            System.out.println("B학점"); // true 출력
        }
        else if (value3 >= 70) {
            System.out.println("C학점"); // true
        }
        else {
            System.out.println("F학점"); // false
        }
        if(value3 >= 70) {
            System.out.println("C학점"); // true
        }
        else if (value3 >= 80) {
            System.out.println("B학점"); // true
        }
        else if (value3 >= 90) {
            System.out.println("A학점"); // false
        }
        else {
            System.out.println("F학점"); // false
        }
        if(value3 >= 70 && value3 < 80) {
            System.out.println("C하점"); // false  한쪽이 true이므로 false
        }
        else if (value3 >= 80 && value3 < 90) {
            System.out.println("B학점"); // true 출력 양쪽이 모두  true
        }
        else if (value3 >= 90) {
            System.out.println("A학점"); // false
        }
        else {
            System.out.println("F학점"); // false
        }
    }
}
