package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class CatDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setColor("Grey");
        cat.setSpecies("Short haired");
        cat.setAge(5);
        cat.setWeight(12.8);
        cat.printInfo();

        Cat catWithName = new Cat();
        catWithName.setName("Tom");
        catWithName.printInfo();

        Cat catWithNameColorAge = new Cat();
        catWithNameColorAge.setName("Tom");
        catWithNameColorAge.setColor("Grey");
        catWithNameColorAge.setAge(5);
        catWithNameColorAge.printInfo();

    }

}
