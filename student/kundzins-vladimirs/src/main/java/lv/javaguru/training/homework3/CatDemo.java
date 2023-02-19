package lv.javaguru.training.homework3;

public class CatDemo {


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Garfild");
        cat1.setColor("Oranz");
        cat1.setSpecies("Bezsugan");
        cat1.setAge(3);
        cat1.setWeight(6.5);
        cat1.printInfo();

        Cat cat2 = new Cat();
        cat2.setName("Barsik");
        cat2.setColor("Melns");
        cat2.setSpecies("Pagalmu");
        cat2.setAge(9);
        cat2.setWeight(8.5);
        cat2.printInfo();

        Cat cat3 = new Cat();
        cat3.setName("Liza");
        cat3.setColor("Balta");
        cat3.setAge(6);
        cat3.setWeight(12);
        cat3.printInfo();
    }
}
