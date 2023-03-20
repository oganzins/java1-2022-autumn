package lv.javaguru.training.lesson9.homework.Animals;

public class Pig extends Animal {

    @Override
    public void voice() {
        System.out.println("Oink!");
    }

    @Override
    public void sleep() {
        System.out.println("Pig is sleeping");
    }
}
