package lv.javaguru.training.lesson9.homework.animals;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal chicken = new Chicken();
        chicken.voice();
        chicken.sleep();

        Animal cow = new Cow();
        cow.voice();
        cow.sleep();

        Animal dog = new Dog();
        dog.voice();
        dog.sleep();

        Animal frog = new Frog();
        frog.voice();
        frog.sleep();

        Animal lion = new Lion();
        lion.voice();
        lion.sleep();
    }
}
