package lv.lv.javaguru.training.lesson9.homework.Animals;

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

        Animal sheep = new Sheep();
        sheep.voice();
        sheep.sleep();

        Animal Duck = new Duck();
        Duck.voice();
        Duck.sleep();

    }

}
