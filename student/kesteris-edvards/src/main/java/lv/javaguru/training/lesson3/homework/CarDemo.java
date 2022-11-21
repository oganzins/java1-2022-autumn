package lv.javaguru.training.lesson3.homework;

public class CarDemo {

    public static void main(String[] args) {
        Car car = new Car();

        car.setName("BMW");
        car.setModel("X6");
        car.setType("Crossover");
        car.setColor("White");
        car.setWheels(4);

        car.printInfo();
    }
}
