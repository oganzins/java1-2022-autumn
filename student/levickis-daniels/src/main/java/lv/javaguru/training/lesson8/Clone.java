package lv.javaguru.training.lesson8;

public class Clone extends Cylinder {


    public Clone(double radius, double height) {
        super(radius, height);
    }


    @Override
    public double getVolume() {
        return super.getVolume()/3;

    }
}