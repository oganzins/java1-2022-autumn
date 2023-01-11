package lv.javaguru.training.lesson9;

public class Rectangle implements Shape {

    private double A;
    private double B;

    public Rectangle(double A, double B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double calculateArea() {
        return A * B;
    }
}
