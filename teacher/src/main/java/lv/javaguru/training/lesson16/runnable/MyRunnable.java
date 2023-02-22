package lv.javaguru.training.lesson16.runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }

}

