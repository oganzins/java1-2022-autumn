package lv.javaguru.training.lesson7;

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println("Car1 - " + car1.getMake());
        System.out.println("Car2 - " + car2.getMake());
        System.out.println("Car3 - " + car3.getMake());
        System.out.println();

        car1.setMake("Audi");

        System.out.println("Car1 - " + car1.getMake());
        System.out.println("Car2 - " + car2.getMake());
        System.out.println("Car3 - " + car3.getMake());
        System.out.println();

        car2.setMake("VW");

        System.out.println("Car1 - " + car1.getMake());
        System.out.println("Car2 - " + car2.getMake());
        System.out.println("Car3 - " + car3.getMake());
        System.out.println();

        car3.setMake("Renault");

        System.out.println("Car1 - " + car1.getMake());
        System.out.println("Car2 - " + car2.getMake());
        System.out.println("Car3 - " + car3.getMake());
        System.out.println();
    }

}
