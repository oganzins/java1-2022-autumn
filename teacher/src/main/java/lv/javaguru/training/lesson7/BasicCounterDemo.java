package lv.javaguru.training.lesson7;

public class BasicCounterDemo {

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        BasicCounter counter = new BasicCounter();
        counter.setCounter(value);

        BasicCounter counter2 = new BasicCounter();
        int value2 = Integer.parseInt(args[1]);
        counter2.setCounter(value2);
    }

}
