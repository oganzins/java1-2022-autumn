package lv.javaguru.training.lesson9;

public class Horse extends Animal {
    @Override
    public void voice(){
        System.out.println("Nei, Nei, Nei");
    }
    @Override
    public void sleep(){
        System.out.println("Zzzz");
    }

}
