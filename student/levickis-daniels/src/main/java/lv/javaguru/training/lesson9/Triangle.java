package lv.javaguru.training.lesson9;

public class Triangle implements Shape {

    private double augstums;
    private double mala;


    public Triangle(double augstums, double mala) {
        this.augstums = augstums;
        this.mala = mala;

    }


    @Override
    public double calculateArea() {
        return mala * (augstums / 2);
    }
}
