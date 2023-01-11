package lv.javaguru.training.lesson9.interfaces.shape;

public class Rectangle implements Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double calculatePerimeter() {
        return (height + width) * 2;
    }
}
