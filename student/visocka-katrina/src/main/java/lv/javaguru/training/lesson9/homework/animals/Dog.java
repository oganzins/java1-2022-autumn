package lv.javaguru.training.lesson9.homework.animals;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("woof, woof, woof");
    }

    @Override
    public void sleep() {
        System.out.println("Sss...");
    }
}
