package lv.javaguru.training.lesson9.interfaces.animal;

public class Stork implements Animal, Bird {

    @Override
    public void eat() {
        System.out.print("Stork is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Stork flies.");
    }
}
