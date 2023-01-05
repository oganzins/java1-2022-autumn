package lv.javaguru.training.lesson9.homework.Animals;

public class Cow extends Animal {

    @Override
    public void voice() {
        System.out.println("Moo!");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping");
    }
}
