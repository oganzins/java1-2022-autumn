package lv.javaguru.training.lesson16.methods;

public class SimpleThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        SimpleThread alpha = new SimpleThread("Alpha", 5000);
        SimpleThread beta = new SimpleThread("Beta", 3000);

        alpha.start();
        beta.start();

        alpha.join();
        beta.join();
    }

}
