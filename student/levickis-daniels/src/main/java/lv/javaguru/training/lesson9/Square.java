package lv.javaguru.training.lesson9;

public class Square implements Shape {

    private double c;


    public Square(double c) {
        this.c = c;
    }


    @Override
    public double calculateArea() {
        return c * c;
    }
}
