package lv.javaguru.training.lesson9;

import java.nio.channels.ScatteringByteChannel;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.voice();
        dog.sleep();

        Animal rabbit = new Rabbit();

        rabbit.voice();
        rabbit.sleep();

        Animal cat = new Cat();

        cat.voice();
        cat.sleep();

        Animal horse = new Horse();

        horse.voice();
        horse.sleep();

        Animal tiger = new Tiger();

        tiger.voice();
        tiger.sleep();
        }
    }
