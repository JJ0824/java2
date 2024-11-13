package Java_Example0326;

public class Triangle implements Shape {

    double langth;
    double width;

    public Triangle() {
    }

    public Triangle(double length,double width) {
        this.langth = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
