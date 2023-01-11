package lv.javaguru.training.lesson9.interfaces.animal;

public class Whale implements Animal, Swimable {

    @Override
    public void eat() {
        System.out.println("Whale eats.");
    }

    @Override
    public void swim() {
        System.out.println("Whale swims.");
    }
}
