package lv.javaguru.training.lesson8.homework;

public class Cylinder extends Circle {

    protected double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        double volume = area() * height;
        return volume;
    }

}
