package C0202;

public class For04 {
    public static void main(String[] args) {
        //논리 연산자
        // @AND(&&)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true && (5 < 3 )); // false
        System.out.println((5 <= 5) && (7 > 2)); // true
        System.out.println();

        // @OR(||)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || (5 < 3)); // false
        System.out.println((5 <= 5) || (7 > 2)); //true
        System.out.println();

        // NOT(!)
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(false || !(5 < 3 )); // true
        System.out.println((5 <= 5) || (7 > 2)); // false
        System.out.println();

        // 비트 연산자로 논리 연산 수행
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(true | (5 < 3)); // true
        System.out.println((5 <= 5) || (7 > 2)); // true
        System.out.println();

    }
}
