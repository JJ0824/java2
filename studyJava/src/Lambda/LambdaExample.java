package Lambda;

interface IntCalculator {
    int calculator(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // calculate 함수의 정의 = 두개의 매개변수의 덧셈
        IntCalculator adder = (a,b) -> a + b;
        int result = adder.calculator(5,3);
        System.out.println(result);

        printResult(4,6, (x,y)->x*y*10);
        printResult(7,8, (x,y)->x*y/10);
    }

    public static void printResult(int x,int y, IntCalculator calculator) {

            System.out.println("Result : " + calculator.calculator(x,y));
        }
    }

