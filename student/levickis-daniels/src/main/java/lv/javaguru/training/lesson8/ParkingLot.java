package lv.javaguru.training.lesson8;

public class ParkingLot {

    public static void main(String[] args) {
        Car car1 = new Car("Black", 2020, "Audi", "A4");
        System.out.println(car1);

        Car car2 = new Car("Black", 2020, "Audi", "A4");
        System.out.println(car2);
        System.out.println("Is car1 equal to car2? " + car1.equals(car2));

        Car car3 = new Car("Red", 2022, "Bmw", "330");
        System.out.println(car3);
        System.out.println("Is car1 equal to car3? " + car1.equals(car3));

        Truck truck = new Truck("Blue", 2018, "Volvo", "FH16", 10000);
        System.out.println(truck);

        Bus bus = new Bus("Yellow", 2020, "Mercedes", "Citro", 30);
        System.out.println(bus);
    }

}







