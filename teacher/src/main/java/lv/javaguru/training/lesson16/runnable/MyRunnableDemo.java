package lv.javaguru.training.lesson16.runnable;

public class MyRunnableDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

}
