package lv.javaguru.training.lesson16.runnable;

import lv.javaguru.training.lesson9.interfaces.shape.Triangle;

public class LambdaRunnableDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
            });
            thread.start();
        }
    }

}
