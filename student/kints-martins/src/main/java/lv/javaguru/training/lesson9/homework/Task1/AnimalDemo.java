package lv.javaguru.training.lesson9.homework.Task1;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.voice();
        dog.sleep();

        Animal cow = new Cow();
        cow.voice();
        cow.sleep();

        Animal fox = new Fox();
        fox.voice();
        fox.sleep();

        Animal snake = new Snake();
        snake.voice();
        snake.sleep();

        Animal wolf = new Wolf();
        wolf.voice();
        wolf.sleep();
    }



}
