// 게임 캐릭터 (추상클래스)
abstract class Charactor {
    String name;
    int hp; // 생명

    public Charactor(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void takeDamage(int amount) {}
    abstract void doAction(); // 추상메서드
}
// 기능 인터페이스 : 근접공격
interface MeleeAttacker {}
// 기능 인터페이스 : 마법 공격
interface MagicCaster {}
// 전사
class Warrior extends Charactor {
    public Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    void doAction() {
        System.out.println("전사는 근접 공격");
    }
}
// 마법사
class Mage extends Charactor {
    public Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    void doAction() {
        System.out.println("마법사는 마법 공격");
    }
}

public class Example2 {
    public static void main(String[] args) {

    }
}
