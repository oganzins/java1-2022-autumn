package lv.javaguru.training.lesson9;

public class Sheep extends Animal
{
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("ahhhhhhh");
    }

    @Override
    public void voice() {
        System.out.println("meeeeh, meeeeh, meeeh");



    }
}
