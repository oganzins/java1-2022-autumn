package lv.javaguru.training.lesson9.homework.Animals;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.voice();
        cat.sleep();

        Animal dog = new Dog();
        dog.voice();
        dog.sleep();

        Animal mouse = new Mouse();
        mouse.voice();
        mouse.sleep();

        Animal cow = new Cow();
        cow.voice();
        cow.sleep();

        Animal bird = new Bird();
        bird.voice();
        bird.sleep();
    }

}