package lv.javaguru.training.homework8;

public class Cone extends Cylinder {

    public Cone(double radius, double height) {
        super(radius, height);
    }


    @Override
    public double volume() {
        result = area() * (getHeight() / 3);
        return result;
    }
}
