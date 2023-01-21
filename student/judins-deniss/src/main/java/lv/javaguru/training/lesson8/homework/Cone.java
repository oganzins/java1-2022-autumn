package lv.javaguru.training.lesson8.homework;

public class Cone extends Cylinder{
    public Cone(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double volume() {
        x = area() * (getHeight() / 3);
        return x;
    }
}
