package lv.javaguru.training.lesson8.homework;

public class Circle {

    private double radius;
    protected double result;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double area() {
        result = 3.14 * radius * radius;
        return result;
    }

    public double length() {
        result = 2 * 3.14 * radius;
        return result;
    }
}
