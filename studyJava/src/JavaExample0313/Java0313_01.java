package JavaExample0313;

    public class Java0313_01 {
        public static void main(String[] args) {

            // 아래 문자열의 글자수를 카운트
            // 스페이스는 카운트하지 마시오

            String string = "The best of both worlds";
            int count = 0;

            string= string.replace(" ","");

            System.out.println(string.length());

        }
    }
