package C0202;

public class For06 {
    public static void main(String[] args) {

//        if( 5 > 3) {
//            System.out.println("촐력1");  // true 이므로 출력됨
//        }
//        if( 5 < 3) {
//            System.out.println("출력2"); // false 이므로 출력안됨
//        }
//        int a = 3;
//        if(a == 3) {
//            System.out.println("출력3"); // true서로 같음 출력됨
//        }
//        boolean b = false;
//        if(b) {
//            System.out.println("출력4"); // flaase 이므로 출력 안됨
//        }

        int a, b;
        a = 5;
        b = 0;
        if (a > 5) {
            b = 10;                // false 이므로 밑에 else 가 실행됨
        } else {
            b = 20;
        }
        System.out.println(b);
    }
}
