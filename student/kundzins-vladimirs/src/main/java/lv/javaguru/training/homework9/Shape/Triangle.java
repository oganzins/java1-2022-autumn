package lv.javaguru.training.homework9.Shape;

public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * base / 2;
    }
}
