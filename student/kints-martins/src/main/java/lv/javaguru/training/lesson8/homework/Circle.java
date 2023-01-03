package lv.javaguru.training.lesson8.homework;

public class Circle {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        double area = 3.14 * radius * radius;
        return area;
    }

    public double length() {
        double length = 2 * 3.14 * radius;
        return length;
    }

}
