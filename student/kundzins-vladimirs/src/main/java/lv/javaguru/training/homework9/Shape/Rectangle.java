package lv.javaguru.training.homework9.Shape;

public class Rectangle implements  Shape{

    private double height;
    private double width;

    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

}
