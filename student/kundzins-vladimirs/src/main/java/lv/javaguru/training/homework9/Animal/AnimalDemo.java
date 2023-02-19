package lv.javaguru.training.homework9.Animal;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.voice();
        cat.sleep();

        Animal dog = new Chicken();
        dog.voice();
        dog.sleep();

        Animal mouse = new Dog();
        mouse.voice();
        mouse.sleep();

        Animal cow = new Human();
        cow.voice();
        cow.sleep();

        Animal bird = new Pig();
        bird.voice();
        bird.sleep();
    }

}

