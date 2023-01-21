package lv.javaguru.training.lesson9.interfaces.shape;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
