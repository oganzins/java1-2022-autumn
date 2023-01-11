package lv.javaguru.training.lesson9.interfaces.animal;

public class AnimalDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        System.out.println();

        Salmon salmon = new Salmon();
        salmon.eat();
        salmon.swim();
        System.out.println();

        Stork stork = new Stork();
        stork.eat();
        stork.fly();
        System.out.println();

        Whale whale = new Whale();
        whale.eat();
        whale.swim();
        System.out.println();
    }

}
