package lv.javaguru.training.lesson7;

public class CarLogicalEqualityDemo {

    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println("car1.equals(car2) : " + (car1.equals(car2)));
        System.out.println("car1.equals(car3) : " + (car1.equals(car3)));
        System.out.println("car2.equals(car3) : " + (car2.equals(car3)));
    }

}
