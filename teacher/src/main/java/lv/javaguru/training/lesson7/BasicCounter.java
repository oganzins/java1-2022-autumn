package lv.javaguru.training.lesson7;

public class BasicCounter {

    private int counter;

    BasicCounter() {

    }

    public void setCounter(int counter) {
        if (isPositive(counter)) {
            this.counter = counter;
        } else {
            clear();
        }
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

    private boolean isPositive(int counter) {
        return counter > 0;
    }

}
