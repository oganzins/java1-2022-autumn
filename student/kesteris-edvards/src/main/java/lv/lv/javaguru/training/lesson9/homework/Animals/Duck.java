package lv.lv.javaguru.training.lesson9.homework.Animals;

public class Duck extends Animal {

    @Override
    public void voice() {
        System.out.println("Pek, pek, pek");
    }

    @Override
    public void sleep() {
        System.out.println("Duck sleep");
    }
}
