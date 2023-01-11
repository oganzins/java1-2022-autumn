package lv.javaguru.training.lesson9.homework.Task2;

public class Triangle implements Shape {

    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area = height * base / 2;
        return area;
    }
}
