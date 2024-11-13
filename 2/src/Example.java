// 전자장치 추상클래스
abstract class Device {
    String model;
    String brand;

    public Device() {
    }

    public Device(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }
    public void powerOn() {
        System.out.println(brand + " " + model + " 전원 켜짐");
    }
    public void powerOff() {
        System.out.println(brand + " " + model + " 전원 꺼짐");
    }
    public abstract void doFunction(); // 추상메서드
}
interface Wifi {
    void connectToWifi(); // 추상메서드
}
interface Bluetooth {
    void connectToBluetooth(); // 추상메서드
}
// 휴대폰
class Phone extends Device implements Wifi, Bluetooth {
    public Phone(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void doFunction() {
        System.out.println("휴대폰이 전화를 겁니다");
    }

    @Override
    public void connectToWifi() {
        System.out.println("휴대폰으로 와이파이에 연결합니다");
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("휴대폰으로 블루투스에 연결합니다");
    }
}
// 노트북
class Laptop extends Device implements Wifi, Bluetooth{
    public Laptop(String model, String brand) {
        super(model, brand);
    }

    @Override
    public void doFunction() {
        System.out.println("노트북이 프로그램을 실행합니다");
    }

    @Override
    public void connectToWifi() {
        System.out.println("노트북을 와이파이에 연결합니다");
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("노트북을 블루투스에 연결합니다");
    }
}
public class Example {
    public static void main(String[] args) {
        Device phone = new Phone("삼성", "갤럭시 S24");
        Device laptop = new Laptop("Apple", "MacBook Pro");
        // 휴대폰
        phone.powerOn();
        phone.doFunction();
        // 동적바인딩이 부모클래스인 Device로 되어있으므로
        // connectToWifi를 호출하기 위해 타입 변환이 필요함
        ((Wifi)phone).connectToWifi();
        ((Bluetooth)phone).connectToBluetooth();
        phone.powerOff();
        
        // 노트북
        laptop.powerOn();
        laptop.doFunction();
        ((Wifi)laptop).connectToWifi();
        ((Bluetooth)laptop).connectToBluetooth();
        laptop.powerOff();
    }
}
