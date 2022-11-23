package lv.javaguru.training.lesson3.homework;

public class CatDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Zīļuks");
        cat.setColor("Gray");
        cat.setAge(11);
        cat.setSpecies("Bezsuga");
        cat.printInfo();

        Cat otherCat = new Cat("Griķītis");
        System.out.println(otherCat.getName());

    }


}
