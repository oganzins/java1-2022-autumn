package lv.lv.javaguru.training.lesson8.homework;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return area() * height;
    }
}
