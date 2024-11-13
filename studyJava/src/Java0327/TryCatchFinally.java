package Java0327;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {  // try안에있는 코드를 실행해보고 문제가 발생(예외)하면 catch를 실행
            System.out.println(3/1);
            int a = Integer.parseInt("20A");
            int[] arr = {1,2,3,4,5};
            arr[5] = 6;
            System.out.println("프로그램 종료1");
        }
        catch (ArithmeticException e) { // 예상이 되는것만 catch
            System.out.println("숫자는 0으로 나눌수 없습니다1");
            System.out.println("프로그램 종료2");
        }
        catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다");
        }
        catch (NullPointerException e) {
            System.out.println("Null 관리좀 잘하자");
        }
        catch (Exception e) {
            System.out.println("예기치못한 에러로 인하여 프로그램을 종료합니다");
        }
            System.out.println("여기가 실행될까?");

        try {
            System.out.println(3/0);
        }
        catch (ArithmeticException e) {
            System.out.println("숫자는 0으로 나눌수 없습니다2");
        }
        finally {
            System.out.println("프로그램 종료3");
        }
    }
}
