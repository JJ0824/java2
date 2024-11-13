package StudyGroup.Study0424;

// 쇼핑을 한 김수중씨, 김수중씨의 장바구니에는 [사과,배,감,바나나,사과,귤,호박,감,수박,감,바나나,귤,사과,배,호박] 가
// 들어있다. 이 중 사과와 바나나는 몇개인지 찾는 코드를 작성하시오.
public class HW02 {
    public static void main(String[] args) {
        String[] Kim = new String[]{"사과", "배", "감", "바나나", "사과", "귤", "호박", "감,", "수박", "감", "바나나", "귤", "사과", "배", "호박" };
        int countApple = 0;
        int countBanana = 0;

        for (int i = 0; i < Kim.length; i++) {
            if ("사과".equals(Kim[i])) {
                countApple++;
            } else if ("바나나".equals(Kim[i])) {
                countBanana++;
            }
        }
        System.out.println("사과 횟수: " + countApple);
        System.out.println("바나나 횟수: " + countBanana);
    }
}
