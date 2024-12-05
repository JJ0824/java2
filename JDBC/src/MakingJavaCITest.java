abstract class Vehicle{
    String modelName; // 모델명
    int maxSpeed; // 최대 속도

    public Vehicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    abstract void drive();
    final void displayInfo() {
        System.out.println("Model: " + modelName + ", Max Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int seatingCapacity; // 좌석수

    public Car(String modelName, int maxSpeed, int seatingCapacity) {
        super(modelName, maxSpeed);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    void drive() {
        System.out.println("도로에서 운전 중입니다.");
    }

    void airConditioning() {
        System.out.println("에어컨이 작동합니다.");
    }
}

class ElectricCar extends Car {
    int batteryCapacity; // 배터리 용량 (kWh 단위)

    public ElectricCar(String modelName, int maxSpeed, int seatingCapacity, int batteryCapacity) {
        super(modelName, maxSpeed, seatingCapacity);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("배터리를 충전 중입니다.");
    }
}

interface Maintenance {
    void performMaintenance(); // 차량 유지보수 수행
}

class Truck extends Vehicle implements Maintenance {
    int loadCapacity; // 적재 용량 (톤 단위)

    public Truck(String modelName, int maxSpeed, int loadCapacity) {
        super(modelName, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void drive() {
        System.out.println("화물을 싣고 운전 중입니다.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("트럭 유지보수를 수행 중입니다.");
    }
}
public class MakingJavaCITest {
    public static void main(String[] args) {
        // Car 객체
        Car car = new Car("Tesla Model S", 250, 5);
        car.displayInfo();
        car.drive();
        car.airConditioning();

        System.out.println();

        // Truck 객체
        Truck truck = new Truck("Tesla Cybertruck", 180, 3);
        truck.displayInfo();
        truck.drive();
        truck.performMaintenance();

        System.out.println();

        // ElectricCar 객체
        ElectricCar electricCar = new ElectricCar("Nissan Leaf", 150, 5, 40);
        electricCar.displayInfo();
        electricCar.drive();
        electricCar.charge();
    }
}
