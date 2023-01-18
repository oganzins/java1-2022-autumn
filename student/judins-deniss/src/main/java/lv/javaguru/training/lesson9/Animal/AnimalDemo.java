package lv.javaguru.training.lesson9.Animal;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.voice();
        pig.sleep();

        Animal cat = new Cat();
        cat.voice();
        cat.sleep();

        Animal dog = new Dog();
        dog.voice();
        dog.sleep();

        Animal horse = new Horse();
        horse.voice();
        horse.sleep();

        Animal cow = new Cow();
        cow.voice();
        cow.sleep();
    }
}