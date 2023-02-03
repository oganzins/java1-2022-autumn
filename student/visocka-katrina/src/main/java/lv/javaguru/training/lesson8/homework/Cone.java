package lv.javaguru.training.lesson8.homework;

public class Cone extends Cylinder {
    public Cone(double radius, int height) {
        super(radius, height);
    }

    @Override
    public double volume() {
        return area() * getHeight() / 3;
    }
}
