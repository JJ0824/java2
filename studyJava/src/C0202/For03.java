package C0202;

public class For03 {
    public static void main(String[] args) {

        int a, b, c;

        // 논리 연산자

        a = 3;
        b = 3;
        c = 3;

        System.out.println(false && a++ > 6);  //false
        System.out.println(true || b++ > 6); // true
        System.out.println(true ^ c++ > 6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 비트 연산자
        a = 3;
        b = 3;
        c = 3;
        System.out.println(false & a++ > 6); //false
        System.out.println(true | b++ > 6); // true
        System.out.println(true^ c++ > 6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
