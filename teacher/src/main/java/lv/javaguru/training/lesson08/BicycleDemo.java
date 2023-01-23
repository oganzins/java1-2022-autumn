package lv.javaguru.training.lesson08;

public class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Dema", 10);
        System.out.println(bicycle);

        MountainBicycle mountainBicycle = new MountainBicycle("Scott", 15, 7);
        System.out.println(mountainBicycle);

        mountainBicycle.accelerate();
        System.out.println(mountainBicycle);
    }

}
