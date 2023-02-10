package lv.javaguru.training.lesson9.Shapes;

public class Rectangle implements Shape{

    private double height;
    private double widht;

    public Rectangle(double height, double widht){
        this.height = height;
        this.widht = widht;
    }

    @Override
    public double calculateArea() {
        return height * widht;
    }
}
