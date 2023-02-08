package lv.javaguru.training.lesson14.generics;

public class Pair<T, S> {

    private T a;
    private S b;

    public Pair(T a, S b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public S getB() {
        return b;
    }

}
