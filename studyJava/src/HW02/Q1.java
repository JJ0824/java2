package HW02;

public class Q1 {
    public static void main(String[] args) {
        // String 문자열의 소문자는 대문자로, 대문자는 소문자로 변경시킨
        // String 문자열을 리턴하는 메서드(changeCase)를 완성하시오
        String str = "cHanGe CasE";
        String result = changcase(str);
        System.out.println(result); // ChANgE cASe
    }

    public static String changcase (String str) {

        char[] a = str.toLowerCase().toCharArray();
        char[] b = str.toUpperCase().toCharArray();
        char[] c = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == a[i]){
                c[i] = b[i];
            }else {
                c[i]= a[i];
            }
        }System.out.println(c);

        return "";
    }
}
