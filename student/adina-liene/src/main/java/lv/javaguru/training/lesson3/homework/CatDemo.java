package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted.
 */
public class CatDemo {


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Mona");
        cat1.setColor("Gray");
        cat1.setSpecies("British Shorthair");
        cat1.setAge(10);
        cat1.setWeight(6);
        cat1.printInfo();

        Cat cat2 = new Cat("Orions");
        cat2.setColor("Seal mitted");
        cat2.setSpecies("Ragdoll");
        cat2.setAge(0.3);
        cat2.setWeight(0.3);
        cat2.printInfo();

        Cat cat3 = new Cat("Princese");
        cat3.setColor("Black");
        cat3.setSpecies("Random bred");
        cat3.setAge(19);
        cat3.setWeight(4);
        cat3.printInfo();


    }


}




