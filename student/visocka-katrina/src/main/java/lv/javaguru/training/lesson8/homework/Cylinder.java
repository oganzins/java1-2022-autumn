package lv.javaguru.training.lesson8.homework;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double volume() {
        return area() * height;
    }
}

