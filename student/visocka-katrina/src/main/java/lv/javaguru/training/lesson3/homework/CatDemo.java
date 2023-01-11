package lv.javaguru.training.lesson3.homework;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Minna");
        cat1.setColor("black");
        cat1.setSpecies("mixed breed");
        cat1.setAge(7);
        cat1.setWeight(4);
        cat1.printInfo();

        Cat cat2 = new Cat("Rudis");
        cat2.setColor("ginger");
        cat2.setSpecies("Turkish Van");
        cat2.setAge(10);
        cat2.setWeight(8);
        cat2.printInfo();

        Cat cat3 = new Cat("Merilina", "grey", 8);
        cat3.setSpecies("Neva Masquerade");
        cat3.setWeight(7);
        cat3.printInfo();
    }

}
