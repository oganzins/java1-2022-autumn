package lv.javaguru.training.lesson7;

public class BasicCounter {

    private int counter;

    BasicCounter() {

    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public void clear() {
        counter = 0;
    }

}
