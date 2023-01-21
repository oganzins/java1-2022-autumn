package lv.javaguru.training.lesson9.interfaces.animal;

public class Salmon implements Fish {

    @Override
    public void eat() {
        System.out.println("Salmon eats.");
    }

    @Override
    public void swim() {
        System.out.println("Salmon swims");
    }
}
