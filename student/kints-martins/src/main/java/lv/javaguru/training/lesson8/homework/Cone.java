package lv.javaguru.training.lesson8.homework;

public class Cone extends Cylinder {

    public Cone(double radius, double height) {

        super(radius, height);
    }

    // 03.01.2023. Pārdefinēšanas darbība tiks mācīta 9.lekcijā.
    @Override
    public double volume() {
        return area() * height / 3;
    }
}
