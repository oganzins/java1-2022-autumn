package lv.javaguru.training.lesson3.homework;

public class DrinkDemo {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.setType("tea");
        drink1.setIsHot(true);
        drink1.setPrice(1.65);
        drink1.printInfo();

        Drink drink2 = new Drink();
        drink2.setType("juice");
        drink2.setIsHot(false);
        drink2.setPrice(1.85);
        drink2.printInfo();

    }
}
