package lv.javaguru.training.lesson9.homework.Task2;

public class Square implements Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        return area;
    }
}
