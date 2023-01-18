package lv.javaguru.training.lesson9.Animal;

public class Cow extends Animal {

    @Override
    public void voice() {
        System.out.println("Moo, moo, moo");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ.. MOO ZZZ..");;
    }
}
