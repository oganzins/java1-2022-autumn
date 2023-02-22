package lv.javaguru.training.lesson16.thread;

import java.util.stream.IntStream;

public class MyThreadDemo {

    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(i -> {
                    MyThread thread = new MyThread();
                    thread.start();
                });
    }

}
