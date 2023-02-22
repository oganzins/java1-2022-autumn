package lv.javaguru.training.lesson16.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + getId() + " is running");
    }

}
