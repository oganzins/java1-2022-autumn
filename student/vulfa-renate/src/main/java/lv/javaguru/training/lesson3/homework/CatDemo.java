package lv.javaguru.training.lesson3.homework;

public class CatDemo {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Cookie");
        cat1.setColor("Brown");
        cat1.setSpecies("Bengal");
        cat1.setAge(7);
        cat1.setWeight(7.7);
        cat1.printInfo();

        Cat cat2 = new Cat();
        cat2.setName("Spidey");
        cat2.setColor("Black");
        cat2.setSpecies("Persian");
        cat2.setAge(3);
        cat2.setWeight(6.8);
        cat2.printInfo();

        Cat cat3 = new Cat();
        cat3.setName("Luke");
        cat3.setColor("Brown");
        cat3.setSpecies("Burmese");
        cat3.setAge(5);
        cat3.setWeight(6.5);
        cat3.printInfo();
    }
}
