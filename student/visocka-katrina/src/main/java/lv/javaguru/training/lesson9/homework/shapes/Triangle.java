package lv.javaguru.training.lesson9.homework.shapes;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return height * base / 2;
    }
}
