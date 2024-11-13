package SwichExample;

public class JavaSwich01 {
    public static void main(String[] args) {

        //break가 포함되지 않았을 때

        int value = 2;
        switch (value) {
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            case 4:
                System.out.println("D");
        }
        System.out.println();

        //break가 포함돼 있을 때

        int vlaue2 = 2;
        switch (vlaue2) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
            default:
                System.out.println("D");
        }
        System.out.println();
    }
}