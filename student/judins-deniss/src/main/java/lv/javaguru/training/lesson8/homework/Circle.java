package lv.javaguru.training.lesson8.homework;

public class Circle {

    private double radius;
    protected double x;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double area() {
        x = 3.14 * radius * radius;
        return x;
    }

     public double length() {
        x = 2 * 3.14 * radius;
        return x;
    }
}
