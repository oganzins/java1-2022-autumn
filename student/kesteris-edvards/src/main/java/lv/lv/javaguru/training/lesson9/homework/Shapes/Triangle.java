package lv.lv.javaguru.training.lesson9.homework.Shapes;

public class Triangle implements Shape {

    private double height;
    private double side;

    public Triangle(double height, double side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (height * side) / 2;
    }
}
