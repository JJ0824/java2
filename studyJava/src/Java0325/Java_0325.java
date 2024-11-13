package Java0325;

abstract public class Java_0325 {
    // 필드
    int a;
    String b;

    // 생성자
    public Java_0325() {
        this.a = 10;
        this.b = "default";
    }

    public Java_0325(int a, String b) {
        this.a = a;
        this.b = b;
    }

    // 메서드
    public int getValue() {
        return a;
    }

    abstract public String getString();

    public void setValue(int a) { // 세터(Setter) 메서드
        this.a = a;
    }

    public void setString(String b) { // 세터(Setter) 메서드
        this.b = b;
    }
}