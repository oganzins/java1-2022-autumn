package lv.javaguru.training.lesson9.homework.Task2;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
}
