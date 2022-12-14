package lv.javaguru.training.lesson7;

public class CarEqualityDemo {

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println("Car1 == Car2 : " + (car1 == car2));
        System.out.println("Car1 == Car3 : " + (car1 == car3));
        System.out.println("Car2 == Car3 : " + (car2 == car3));
    }

}
