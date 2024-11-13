package Typecasting0313_01;

class A {}
class B extends A{}

public class Typecasting02 {
    public static void main(String[] args) {
        // instanceof
        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A);
        System.out.println(aa instanceof A);

        System.out.println(aa instanceof B);
        System.out.println(aa instanceof B);

        if(aa instanceof B) {
            B b = (B) ab;
            System.out.println("ab를 B로 캐스팅했습니다");
        } else {
            System.out.println("aa는 B 타입으로 캐스팅이 불가능!!!");
        }
        if(aa instanceof B) {
            B b = (B) ab;
            System.out.println("ab를 B로 캐스팅했습니다");
        } else {
            System.out.println("aa는 B 타입으로 캐스팅이 불가능!!!");
        }
        if ("안녕" instanceof String) {
            System.out.println("\"안녕\"은 String 클래스입니다.");
        }


    }
}
