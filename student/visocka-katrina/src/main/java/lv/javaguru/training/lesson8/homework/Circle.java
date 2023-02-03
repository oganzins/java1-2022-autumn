package lv.javaguru.training.lesson8.homework;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double length() {
        return 2 * 3.14 * radius;
    }
}
