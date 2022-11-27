package lv.javaguru.training.lesson3.homework;

public class CatDemo {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Armands");
        cat1.setColor("Red");
        cat1.setSpecies("Manecoon");
        cat1.setAge(3);
        cat1.setWeight(9.5);
        cat1.printInfo();

        Cat cat2 = new Cat("Odins");
        cat2.setColor("White");
        cat2.setSpecies("Persian");
        cat2.setAge(7);
        cat2.setWeight(12);
        cat2.printInfo();

        Cat cat3 = new Cat("Odins", "Black", 3);
        cat3.setSpecies("Manecoon");
        cat3.setAge(1);
        cat3.setWeight(5);
        cat3.printInfo();
    }

}
